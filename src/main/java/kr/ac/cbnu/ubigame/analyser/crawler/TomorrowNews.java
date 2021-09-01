package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class TomorrowNews extends AbsCrawler {

	public TomorrowNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal ="내일신문";
	}
	
	public TomorrowNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal ="내일신문";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.arrayBody.add("div[class=articleArea] > div[id=contents]");
		this.arrayBody.add("div[id=articleBodyContents]");
		this.arrayBody.add("div[class=articleArea]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("div[class=articleArea]> h3");
		this.arrayTitle.add("div[class=articleArea]");
		this.arrayTitle.add("title");
		this.arrayTitle.add("div[class=article_info] > div[id=articleTitle]");
		
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
