package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class AutoTimes extends AbsCrawler {

	public AutoTimes(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "오토타임즈";
	}
	
	public AutoTimes(String url, String searchword, Date finalDate) throws IOException {
		super(url,searchword,finalDate);
		// TODO Auto-generated constructor stub
		this.journal = "오토타임즈";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=talklink_contents]");
		this.arrayBody.add(" div[class=bd_area]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=view-title]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
