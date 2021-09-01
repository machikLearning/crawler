package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class BridgeEconomy extends AbsCrawler {

	public BridgeEconomy(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "브릿지경제";
	}
	
	public BridgeEconomy(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "브릿지경제";
	}


	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=left_text_box]");
		this.arrayBody.add(" div[class=view_left_warp]");
		this.arrayBody.add(" div[class=con_left]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=top_title]");
		this.arrayTitle.add(" div[class=view_top]");
		this.arrayTitle.add(" ul[class=view_search]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
