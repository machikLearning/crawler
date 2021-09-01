package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class AsiaNewsCommunicate extends AbsCrawler {

	public AsiaNewsCommunicate(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "아시아뉴스통신";
	}
	
	public AsiaNewsCommunicate(String url, String searchword, Date finalDate) throws IOException {
		super(url,searchword,finalDate);
		// TODO Auto-generated constructor stub
		this.journal = "아시아뉴스통신";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=subSec01]");
		this.arrayBody.add(" div[id=subSecW]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" ul[class=top_latest]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
