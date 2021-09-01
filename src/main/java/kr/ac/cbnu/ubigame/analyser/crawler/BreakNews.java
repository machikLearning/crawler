package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class BreakNews extends AbsCrawler {

	public BreakNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "브레이크뉴스";
	}
	
	public BreakNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "브레이크뉴스";
	}


	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=CLtag]");
		this.arrayBody.add(" div[id=textinput]");
		this.arrayBody.add(" td[class=read_body]");
		this.arrayBody.add(" div[id=CLtag]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=article_head]");
		this.arrayTitle.add(" div[id=contents_wrap]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
