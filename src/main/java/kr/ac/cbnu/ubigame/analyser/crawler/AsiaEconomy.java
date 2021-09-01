package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class AsiaEconomy extends AbsCrawler {

	public AsiaEconomy(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "아시아경제";
	}
	
	public AsiaEconomy(String url, String searchword, Date finalDate) throws IOException {
		super(url,searchword,finalDate);
		// TODO Auto-generated constructor stub
		this.journal = "아시아경제";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=txt]");
		this.arrayBody.add(" div[class=article]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[id=bodyContents]");
		this.arrayTitle.add(" div[class=area_title]");
		this.arrayTitle.add(" div[class=view_bg_box]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
