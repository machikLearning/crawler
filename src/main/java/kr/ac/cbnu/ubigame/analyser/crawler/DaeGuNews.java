package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class DaeGuNews extends AbsCrawler {

	public DaeGuNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "대구뉴스";
	}
	
	public DaeGuNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "대구뉴스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=news_text]");
		this.arrayBody.add(" div[class=news_content]");
		this.arrayBody.add(" div[id=artText]");
		this.arrayBody.add(" div[class=newsWrap]");
		this.arrayBody.add(" div[class=news_header]");
		this.arrayBody.add(" div[class=newsWrap]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=news_header]");
		this.arrayTitle.add(" div[class=newsWrap]");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
