package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class Pressian extends AbsCrawler {

	public Pressian(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "프레시안";
	}
	
	public Pressian(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "프레시안";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=news_body_area]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=rot]");
		this.arrayTitle.add(" div[class=wrap]");
		this.arrayTitle.add(" div[class=text-info]");
		this.arrayTitle.add(" div[class=m01_arv]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
