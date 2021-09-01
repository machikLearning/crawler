package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class KoreaEconomyTV extends AbsCrawler {

	public KoreaEconomyTV(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "한국경제TV";
	}

	public KoreaEconomyTV(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "한국경제TV";
	}
	
	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=viewWrap]");
		this.arrayBody.add(" span[class=article_contents]");
		this.arrayBody.add(" div[id=article_cont]");
		this.arrayBody.add(" div[id=viewContent_3]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[id=viewTitle]");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
