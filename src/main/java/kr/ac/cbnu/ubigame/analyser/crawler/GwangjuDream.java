package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class GwangjuDream extends AbsCrawler {

	public GwangjuDream(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "광주드림";
	}
	
	public GwangjuDream(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "광주드림";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.arrayBody.add("div[id=content]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("title");
		this.arrayTitle.add("tr > td > font");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}



}
