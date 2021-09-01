package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class NewsKorea extends AbsCrawler {

	public NewsKorea(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "뉴스코리아";
	}
	
	public NewsKorea(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "뉴스코리아";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=joinskmbox]");
		this.arrayBody.add(" div[id=article]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=articleTitle]");
		this.arrayTitle.add(" div[id=content_ADTOM]");
		this.arrayTitle.add(" div[class=conLeft]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
