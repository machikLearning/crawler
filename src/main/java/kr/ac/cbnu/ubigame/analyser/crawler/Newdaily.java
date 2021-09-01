package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;


public class Newdaily extends AbsCrawler {

	public Newdaily(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "뉴데일리";
	}

	public Newdaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "뉴데일리";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.arrayBody.add("div[id=news_body_area]");
		this.arrayBody.add("div[id=ndArtBody]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("title");
		this.arrayTitle.add("div[class=hbox] > h2");
		this.arrayTitle.add("div[id=titlebox] > h1");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
