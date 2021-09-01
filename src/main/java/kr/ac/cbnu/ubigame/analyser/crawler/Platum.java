package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class Platum extends AbsCrawler {

	public Platum(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "플래텀";
	}
	
	public Platum(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "플래텀";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=post_info]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=post_header single]");
		this.arrayTitle.add(" div[class=post_header_title]");
		this.arrayTitle.add(" div[class=post_header]");
		this.arrayTitle.add(" div[class=post_info_title]");
		this.arrayTitle.add(" div[class=post_info]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
