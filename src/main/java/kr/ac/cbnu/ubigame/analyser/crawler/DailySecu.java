package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class DailySecu extends AbsCrawler {

	public DailySecu(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "데일리시큐";
	}
	
	public DailySecu(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "데일리시큐";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=arl_view_tags_box not_print]");
		this.arrayBody.add(" div[id=content]");
		this.arrayBody.add(" div[id=arl_view_content]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=arl_view_title_box]");
		this.arrayTitle.add(" div[id=arl_view_box]");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
