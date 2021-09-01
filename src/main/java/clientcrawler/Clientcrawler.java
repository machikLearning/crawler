package clientcrawler;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Level;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import communicationServer.CheckList;
import kr.ac.cbnu.ubigame.analyser.common.AnalyserLogger;
import kr.ac.cbnu.ubigame.analyser.common.SimpleJournalFactory;
import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;
import kr.ac.cbnu.ubigame.analyser.common.datatype.NonPressDatatype;
import kr.ac.cbnu.ubigame.analyser.common.datatype.WebDatatype;

/**
 * 실제 크롤링을 하는 객체
 * PageURL은 Server로부터 전달 받은 URL
 * crawlers는 미리 조사한 target Attribute를 담고있는 객체 인스턴스 Map
 * @author user
 *
 */
public class Clientcrawler {
	private String pageURL;
	private String searchword;
	private CheckList sendcl;
	private ArrayList<WebDatatype> wd;
	private ArrayList<NonPressDatatype> nd;
	private Document doc;
	private int clientstep;
	private AnalyserLogger analyserLogger;
	private SimpleJournalFactory sjf;
	private int searchEngineBlock;
	private int pressBlock;
	private List<Thread> absCrawlerList;
	
	public Clientcrawler(){
		this.doc =null;
		this.sendcl=new CheckList();
		this.wd = new ArrayList<WebDatatype>();
		this.clientstep = 1;
		this.analyserLogger = new AnalyserLogger();
		this.nd = new ArrayList<NonPressDatatype>();
		this.sjf = new SimpleJournalFactory();
		this.searchEngineBlock = 0;
		this.pressBlock = 0;
		this.absCrawlerList = new ArrayList<Thread>();
	}
	
	/**
	 * 자신이 검색엔진에 접속할 수 없는 상태라면 자신의 step을 2로 바꾼다
	 * 2로 바꾸면 쓰레드를 재우는 형식
	 * @throws Exception
	 */
	public void Clientcralwermain() throws Exception{
		if(urlCalculate()){
			this.clientstep = 1;
		}
		else{
			System.out.println("죽음");
			this.clientstep = 2;
			this.searchEngineBlock++;
		}
	}
	
	public int Getclientstep(){
		return this.clientstep;
	}
	
	/**
	 * Server로부터 전송받은 PageURL에 접속하는 함수 접속할 수 없다면 False를 반환 접속할 수 있다면 True를 반환
	 * @return
	 * @throws Exception
	 */
	public boolean urlCalculate() throws Exception{ 
		try {
			this.doc = Jsoup.connect(this.pageURL).userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.124 Safari/537.36").get();
		} catch (IOException e) {
			analyserLogger.setLoggerConf("Searchdead", "102400", Level.ERROR);
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public CheckList Getsendcl(){
		return this.sendcl;
	}
	
	/**
	 * 검색 페이지 내에 있는 targetURL로 접속하는 메소드
	 * @throws Exception 
	 */
	public void OperateTrue() throws Exception{
		String content = "body[class=tabsch tabsch_news] > div[id=wrap] > div[id=container] > div[id=content] > div[id=main_pack] > div[class=news mynews section _prs_nws] > ul[class=type01] > li";
		Elements E  = doc.select(content);
		for(Element e : E){ // 네이버 검색창에 기사를 접근하는 함수
			Elements press = e.select("dl>dd[class=txt_inline] > span[class=_sp_each_source]");
			AbsCrawler crawler = null;
			Elements l = e.select("dl>dt>a");
			Elements date = e.select("dl>dd[class=txt_inline]");
			Date finaldate = this.disuniteDateText(date);
			crawler = this.sjf.getPressCrawler(press.text(), l.attr("href"), this.searchword, finaldate);
			if(crawler != null) {
				this.absCrawlerList.add(new Thread(crawler));
			}
			for(Thread absCrawler : this.absCrawlerList) {
				absCrawler.start();
			}
			for(Thread thread : this.absCrawlerList) {
				thread.join();
			}
			this.absCrawlerList.clear();
			//if(crawler == null){
				//String dataDate = DateSearch(E.select("span[class = ").get(articlenumber).text());
				//analyserLogger.setLoggerConf("Noninvestigate", "102400", Level.INFO);
				//Utils.journalNonExsist(l.attr("data-source-name"),l.attr("data-url"),l.attr("data-title"),dataDate,company);
				//System.out.println("continue구문 :" + e.select("dl>dd[class=txt_inline] > span[class=sp_each_source]").text());
				//continue;
			//}
		}		
	}
	

	private String searchPress(Elements date) {
		// TODO Auto-generated method stub
		String press = date.select("span[class=_sp_each_source]").text();
		return press;
	}

	private Date disuniteDateText(Elements date) throws ParseException {
		// TODO Auto-generated method stub
		String press = searchPress(date);
		String entiretext = date.text();
		String result = entiretext.replace(press, "");
		String newspaper = date.select("span[class=newspaper]").text();
		if(!newspaper.isEmpty()){
			result = result.replace(newspaper, "");
		}
		result = result.replace(" ", "");
		return DateSearch(result);
	}

	/*조사가 안되거나 조사가 막힌 url들의 날짜를 계산하는 부분*/
	private Date DateSearch(String text) throws ParseException {
		String dataDate = "";
		if(text.contains("일전") || text.contains("시간전")||text.contains("분전")){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Calendar cal = Calendar.getInstance();
			if(text.contains("일전")){
				int cut = text.indexOf("일");
				text = text.substring(0, cut);
				cal.add(cal.DATE, -(Integer.parseInt(text)));
				dataDate = sdf.format(new Date(cal.getTimeInMillis()));
				}
			else{
				if(text.contains("시간전")){
					int cut = text.indexOf("시");
					text = text.substring(0,cut);
					java.util.Date time = cal.getTime();
					cal.setTime(time);
					cal.add(cal.HOUR, -(Integer.parseInt(text)));
					dataDate = sdf.format(new Date(cal.getTimeInMillis()));
					dataDate = dataDate.substring(0,8);
				}
				else{
					int cut = text.indexOf("분");
					text = text.substring(0, cut);
					java.util.Date time = cal.getTime();
					cal.setTime(time);
					cal.add(cal.MINUTE, -Integer.parseInt(text));
					dataDate = sdf.format(new Date(cal.getTimeInMillis()));
					dataDate = dataDate.substring(0,8);
				}
			}
		}
		else{
			text = text.replaceAll("[^0-9]","");
			dataDate = text;
		}
		return new SimpleDateFormat("yyyyMMdd").parse(dataDate);
	}
	
//	private WebDatatype startCrawling(AbsCrawler crawler,Date finaldate) throws IOException, ParseException {
//		WebDatatype wd = crawler.getWebDatatype();
//		wd.SetDate(finaldate);
//		return wd;
//	}
	
	
	public ArrayList<WebDatatype> getWD(){
		return this.wd;
	}
	
	public void Initializewd(){
		this.wd.clear();
		this.nd.clear();
	}


	public void setTargeturl(String targetURL) {
		this.pageURL = targetURL;
	}


	public void setSearchword(String searchword) {
		this.searchword = searchword;
	}

	public ArrayList<NonPressDatatype> getNonPressArrayList() {
		// TODO Auto-generated method stub
		return this.nd;
	}
	
	public void initNonpress(){
		this.nd  = new ArrayList<NonPressDatatype>();
	}

	public void setClientstep(int i) {
		// TODO Auto-generated method stub
		this.clientstep = i;
	}

	public int getSearchEngineBlock() {
		// TODO Auto-generated method stub
		return this.searchEngineBlock;
	}

	public int getPressBlock() {
		// TODO Auto-generated method stub
		return this.pressBlock;
	}
	

	/*public NonPressDatatype OperateTrue() throws Exception{
		AbsCrawler abscrawler = this.sjf.getPressCrawler(this.journal, this.pageURL);
		NonPressDatatype nd = new NonPressDatatype(this.pageURL, abscrawler.bodyCrawler());
		return nd;
	}*/

}
