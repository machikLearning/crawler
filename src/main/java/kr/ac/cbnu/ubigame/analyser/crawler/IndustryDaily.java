package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class IndustryDaily extends AbsCrawler {

	public IndustryDaily(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "산업일보";
	}
	
	public IndustryDaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "산업일보";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=leading-news list]");
		this.arrayBody.add(" div[class=section-news bx]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=titleArea02]");
		this.arrayTitle.add(" div[class=articleTitleArea]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
