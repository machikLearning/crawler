package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class DongaScience extends AbsCrawler {

	public DongaScience(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "동아사이언스";
	}
	
	public DongaScience(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "동아사이언스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=article_body]");
		this.arrayBody.add(" div[id=article]");
		this.arrayBody.add(" div[id=view]");
		this.arrayBody.add("html");
	


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[id=article_title]");
		this.arrayTitle.add("title");



	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
