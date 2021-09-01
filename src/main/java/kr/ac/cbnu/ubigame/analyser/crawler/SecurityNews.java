package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class SecurityNews extends AbsCrawler {

	public SecurityNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "보안뉴스";
	}
	
	public SecurityNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "보안뉴스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=media]");
		this.arrayBody.add(" div[id=body_left]");
		this.arrayBody.add(" div[id=news_content]");
		this.arrayBody.add(" div[id=body]");
		this.arrayBody.add(" div[id=news_re]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[id=body_top]");
		this.arrayTitle.add(" div[id=news_tag_txt]");
		this.arrayTitle.add(" div[id=news_relation2]");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
