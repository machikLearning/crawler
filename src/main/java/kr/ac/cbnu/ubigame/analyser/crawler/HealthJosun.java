package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class HealthJosun extends AbsCrawler {

	public HealthJosun(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal="헬스조선";
	}
	
	public HealthJosun(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal="헬스조선";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=article]");
		this.arrayBody.add(" div[id=news_body_id]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=news_title_text]");
		this.arrayTitle.add(" header[class=news_title]");
		this.arrayTitle.add(" dl[id=csh_min_title]");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
