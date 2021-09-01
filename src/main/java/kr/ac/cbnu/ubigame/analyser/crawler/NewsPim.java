package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class NewsPim extends AbsCrawler {

	public NewsPim(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "뉴스핌";
	}
	
	public NewsPim(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "뉴스핌";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=bodynews_title]");
		this.arrayBody.add(" div[class=bodynews pad_top10]");
		this.arrayBody.add(" div[id=news_contents]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" ul[class=newslist]");
		this.arrayTitle.add(" div[class=bodynews_title]");
		this.arrayTitle.add(" div[class=bodynews pad_top10]");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
