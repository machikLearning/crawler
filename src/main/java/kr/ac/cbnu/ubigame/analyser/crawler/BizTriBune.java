package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class BizTriBune extends AbsCrawler {

	public BizTriBune(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "비즈트리뷴";
	}
	
	public BizTriBune(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "비즈트리뷴";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=news_detail]");
		this.arrayBody.add(" div[id=talklink_contents]");
		this.arrayBody.add(" div[class=artc_view]");
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
