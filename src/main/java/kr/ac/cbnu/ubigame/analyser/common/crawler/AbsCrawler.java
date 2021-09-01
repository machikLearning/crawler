package kr.ac.cbnu.ubigame.analyser.common.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import kr.ac.cbnu.ubigame.analyser.common.datatype.SingleTonWebDataTypeList;
import kr.ac.cbnu.ubigame.analyser.common.datatype.WebDatatype;


public abstract class AbsCrawler implements Runnable{
	protected Document doc;
	protected String journal;
	protected ArrayList<String> arrayTitle;
	protected ArrayList<String> arrayBody;
	private String targetURL;
	private String searchcompany;
	private String journalID;
	private Date finalDate;
	
	public AbsCrawler(String targetURL) throws IOException {
		this.targetURL = targetURL;
		this.doc = Jsoup.connect(targetURL).get();
		this.arrayBody = new ArrayList<String>();
		this.arrayTitle = new ArrayList<String>();
		this.journalID = targetURL;
		initArrayTitle();
		initArrayBody();
	}
	
	public void run() {
		try {
			SingleTonWebDataTypeList.getInstace().addWebData(this.getWebDatatype());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public AbsCrawler(String targetURL, String searchcompany,Date finalDate) throws IOException{
		this(targetURL);
		this.searchcompany = searchcompany;
		this.finalDate = finalDate;
		
	}
	
	protected abstract void initArrayBody();
	protected abstract void initArrayTitle(); 
	public abstract Date timeAdjust() throws ParseException;
	
	public String getJournal() {
		return this.journal;
	}
	
	public void setSearchCompany(String searchcompany){
		this.searchcompany = searchcompany;
	}
	
	public WebDatatype getWebDatatype() throws IOException, ParseException {
		WebDatatype result = new WebDatatype();
		result.SetTargetCompany(this.searchcompany);
		result.SettargetUrl(this.targetURL);
		result.SetArticleBody(this.bodyCrawler());
		result.SetDate(this.finalDate);
		result.SetJournal(this.journal);
		result.SetJournalId(this.journalIDSearch());
		result.SetArticleTitle(this.titleCrawler());
		return result;
	}
	
	/**
	 * 신문본문 크롤링
	 */
	public String bodyCrawler() throws IOException{
		return this.iterator(this.arrayBody);
	}
	public String journalIDSearch(){
		return this.journalID;
	}
	
	/**
	 * 기사게시시간을 yyyymmdd 형식으로 변형시켜주는 함수
	 * @return
	 * @throws ParseException 
	 */
	
	public String titleCrawler(){
		return this.iterator(this.arrayTitle);
	};
	
	protected String iterator(ArrayList<String> array){
		for(String s: array){
			Elements e = this.doc.select(s);
			if(!e.text().isEmpty())
				return e.text();
		}
		return null;
	}
}
