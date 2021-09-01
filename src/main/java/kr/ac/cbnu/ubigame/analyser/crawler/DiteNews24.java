package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class DiteNews24 extends AbsCrawler {

	public DiteNews24(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "디트뉴스24";
	}
	
	public DiteNews24(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "디트뉴스24";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=cnt_view news_body_area]");
		this.arrayBody.add(" div[class=c011_arv]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=hbox]");
		this.arrayTitle.add(" div[class=arvtitle]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
