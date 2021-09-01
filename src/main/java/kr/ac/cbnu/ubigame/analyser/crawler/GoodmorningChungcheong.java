package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class GoodmorningChungcheong extends AbsCrawler {

	public GoodmorningChungcheong(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal ="굿모닝충청";
	}
	
	public GoodmorningChungcheong(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal ="굿모닝충청";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.arrayBody.add("div[id=articleBody]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("title");
		this.arrayTitle.add("strong[class=headline-title]");
		this.arrayTitle.add("div[class=headline border-box] > strong[class=headline-title]");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
