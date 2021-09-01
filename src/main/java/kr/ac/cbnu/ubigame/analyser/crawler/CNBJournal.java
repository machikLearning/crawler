package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class CNBJournal extends AbsCrawler {

	public CNBJournal(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal ="CNB저널";
	}

	public CNBJournal(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal ="CNB저널";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.arrayBody.add("div[class=cnt_view news_body_area] > div[id=news_body_area]");

	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("div[class=arvtitle]");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
