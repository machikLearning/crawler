package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class AcroPen extends AbsCrawler {

	public AcroPen(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "아크로펜";
	}
	
	public AcroPen(String url, String searchword, Date finalDate) throws IOException {
		super(url,searchword,finalDate);
		// TODO Auto-generated constructor stub
		this.journal = "아크로펜";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=viewConW]");
		this.arrayBody.add(" div[id=con]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=viewHeadW]");
		this.arrayTitle.add(" div[id=secWrap]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}



}
