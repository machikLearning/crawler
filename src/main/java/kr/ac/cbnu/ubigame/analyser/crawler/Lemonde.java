package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class Lemonde extends AbsCrawler {

	public Lemonde(String targetURL) throws IOException {
		super(targetURL);
		this.journal = "르몽드";
		// TODO Auto-generated constructor stub
	}
	
	public Lemonde(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "르몽드";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=talklink_contents]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
