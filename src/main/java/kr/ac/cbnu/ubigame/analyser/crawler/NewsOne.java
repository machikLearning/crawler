package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class NewsOne extends AbsCrawler {

	public NewsOne(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal ="뉴스1";
	}
	
	public NewsOne(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal ="뉴스1";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.arrayBody.add("div[id=articles_detail]");
		this.arrayBody.add("div[id=article_body_content]");
		this.arrayBody.add("div[id=PhotoDetails] > div[class= text_wrap]");
		this.arrayBody.add("div[id=PhotoDetails]");
		this.arrayBody.add("div[id=articles_detail]");
		this.arrayBody.add("tbody > tr > td[id=content_caption_id]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("title");
		this.arrayTitle.add("div[class=title] > h2");
		this.arrayTitle.add("div[id=PhotoDetails] > h3");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
