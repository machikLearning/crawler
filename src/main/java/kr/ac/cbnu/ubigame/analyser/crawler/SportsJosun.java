package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class SportsJosun extends AbsCrawler {

	public SportsJosun(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "스포츠조선";
	}
	
	public SportsJosun(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "스포츠조선";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=news_text]");
		this.arrayBody.add(" div[class=news_content]");
		this.arrayBody.add(" div[class=deatail1]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=acle_c]");
		this.arrayTitle.add(" div[class=deatail1]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
