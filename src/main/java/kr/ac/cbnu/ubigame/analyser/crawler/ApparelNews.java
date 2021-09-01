package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class ApparelNews extends AbsCrawler {

	public ApparelNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "어패럴뉴스";
	}
	
	public ApparelNews(String url, String searchword, Date finalDate) throws IOException {
		super(url,searchword,finalDate);
		// TODO Auto-generated constructor stub
		this.journal = "어패럴뉴스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" span[id=PrintLayer]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
