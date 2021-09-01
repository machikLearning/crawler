package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class KoreaEconomy extends AbsCrawler {

	public KoreaEconomy(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "한국경제";
	}
	
	public KoreaEconomy(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "한국경제";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=newsView]");
		this.arrayBody.add(" div[class=news_wrap news_view]");
		this.arrayBody.add(" div[class=act-body]");
		this.arrayBody.add(" div[class=news_sbj]");
		this.arrayBody.add(" div[class=artlcle_top]");
		this.arrayBody.add(" div[id=container]");
		this.arrayBody.add(" div[class=wrap_article]");
		this.arrayBody.add(" div[class=wrap_view basic_temp]");
		this.arrayBody.add(" div[id=contents]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" header[class=sbj]");
		this.arrayTitle.add(" section[class=news-atc-tit]");
		this.arrayTitle.add(" div[class=news_sbj]");
		this.arrayTitle.add(" div[class=top_title]");
		this.arrayTitle.add(" div[class=artlcle_top]");
		this.arrayTitle.add(" div[class=article_type_one]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
