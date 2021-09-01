package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class Fomos extends AbsCrawler {

	public Fomos(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "포모스";
	}
	
	public Fomos(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "포모스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=view_area]");
		this.arrayBody.add(" div[class=board_view]");
		this.arrayBody.add(" div[class=board_area common_view]");
		this.arrayBody.add(" div[class=left_]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=board_area common_view]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
