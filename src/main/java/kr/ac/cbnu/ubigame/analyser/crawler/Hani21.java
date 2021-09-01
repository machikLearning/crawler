package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class Hani21 extends AbsCrawler {

	public Hani21(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "한겨레21";
	}
	
	public Hani21(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "한겨레21";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=article_body]");
		this.arrayBody.add(" div[class=container0]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" header[class=article_head]");
		this.arrayTitle.add(" div[id=article_contents]");
		this.arrayTitle.add(" div[class=title1]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
