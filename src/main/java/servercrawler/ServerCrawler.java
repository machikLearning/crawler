
package servercrawler;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import communicationServer.CheckList;
import kr.ac.cbnu.ubigame.analyser.common.Utils;

public class ServerCrawler{
	private ArrayList<CheckList> sendcl;
	private int step;
	private String targetcompany;
	private String mainurl;
	private int pagecount;
	
	public ServerCrawler(ArrayList<CheckList> sendcl, int step){
		this.sendcl = sendcl;
		this.targetcompany = null;
		mainurl= null;
		pagecount = 0;
		this.step = step;
	}
	
	/*크롤링 될 회사를 입력하는 함수*/
	public String searchwordInput() throws IOException{ 
		while(targetcompany == null){
			System.out.println("검색 회사를 입력하세요");
			Scanner scan = new Scanner(System.in);
			this.targetcompany = scan.nextLine();
		}
		return this.targetcompany;
	}
	
	public void searchStart() throws IOException{/*Search함수의 메인*/
		String targetcompany = searchwordInput();
		String containcompany = Utils.UTFEncording(targetcompany);
		containcompany += dateCalculate();
		this.mainurl = containcompany;
		pageCalculate();
		
	}
	
	public void NextsearchStart(){
		Looppage();
	}
	
	public int pageCalculate() throws IOException {
		String page = this.mainurl + "&page=1";
		Document dom = Jsoup.connect(page).get();
		Elements div = dom.select("span[class = result_num]");
		String entirepage = div.text();
		System.out.print(entirepage);
		if(!(entirepage.isEmpty())){
			int cut = entirepage.indexOf("/");
			entirepage = entirepage.substring(cut, entirepage.length());
			entirepage = entirepage.replaceAll("[^0-9]", "");
			this.pagecount = Integer.parseInt(entirepage)/10;
			return 0;
		}
		wrongSearch(page);
		return 0;
	}
	
	/*검색범위시간 설정*/
	public String dateCalculate() {
		String enddate;
		String startdate; 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		Date date = new Date(cal.getTimeInMillis());
		enddate = sdf.format(date);
		cal.add(cal.YEAR, -6);
		date = new Date(cal.getTimeInMillis());
		startdate = sdf.format(date);
		String datequery = "&startDate=" + startdate+ "&endDate="+ enddate;
		return datequery;
	}
	

	
	/*잘못된 검색어를 입력했을 경우 확인하여 주는 함수*/
	public boolean wrongSearch(String PageURL) throws IOException {
		Document doc = Jsoup.connect(PageURL).get();
		Elements E = doc.select("title");
		String title = E.text();
		System.out.println(title);
		if(title.startsWith("검색 결과가 없습니다 : 네이버 뉴스")){
			System.out.println("검색어를 다시 입력하세요");
			return true;
		}
		
		else
			return false;
	}
	
	public void Looppage(){
		for(int i = 1; i < this.pagecount; i++){
			String page = this.mainurl +"&page = " + String.valueOf(i);
			sendcl.add(Makesendcl(page));
		}
	}

	private CheckList Makesendcl(String page) {
		CheckList cl = new CheckList();
		return cl;
	}
}
