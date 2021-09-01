package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class BusinessWatch extends AbsCrawler {

	public BusinessWatch(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "비즈니스워치";
	}
	
	public BusinessWatch(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "비즈니스워치";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=news-view]");
		this.arrayBody.add(" html[id=kimsQStart]");
		this.arrayBody.add(" div[id=view_content]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=modal-scrollbx]");
		this.arrayTitle.add(" div[class=news-view-info]");
		this.arrayTitle.add(" div[id=view_content]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
