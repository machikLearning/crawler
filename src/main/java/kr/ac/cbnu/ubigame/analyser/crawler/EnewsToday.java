package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class EnewsToday extends AbsCrawler {

	public EnewsToday(String targetURL) throws IOException {
		super(targetURL);
		this.journal = "이뉴스투데이";
	}
	
	public EnewsToday(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "이뉴스투데이";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" p[class=바탕글]");
		this.arrayBody.add(" div[id=articleBody]");
		this.arrayBody.add(" div[class=content border-box]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add(" div[class=headline border-box]");
		this.arrayTitle.add(" div[id=article-wrap]");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
