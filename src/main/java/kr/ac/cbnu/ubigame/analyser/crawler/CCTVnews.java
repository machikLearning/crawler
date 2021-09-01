package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class CCTVnews extends AbsCrawler {

	public CCTVnews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "CCTV뉴스";
	}

	public CCTVnews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "CCTV뉴스";
	}

	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.arrayBody.add("div[id=articleBody]");
		this.arrayBody.add("div[id=CmAdContent]");
		
	}

	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("title");
		this.arrayTitle.add("div[class=headline]");
		
	}

	@Override
	public String bodyCrawler() throws IOException {
		// TODO Auto-generated method stub
		String result = this.iterator(this.arrayBody);
		return result;
	}

	@Override
	public String journalIDSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String titleCrawler() {
		// TODO Auto-generated method stub
		String result = this.iterator(this.arrayTitle);
		return result;
	}

}
