package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class DongaAuto extends AbsCrawler {

	public DongaAuto(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "동아오토";
	}
	
	public DongaAuto(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "동아오토";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add("html");
		this.arrayBody.add(" div[id=content]");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=article_title]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
