package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class KoreaFiberNews extends AbsCrawler {

	public KoreaFiberNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "한국섬유신문";
	}
	
	public KoreaFiberNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "한국섬유신문";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=cts]");
		this.arrayBody.add(" div[class=inner]");
		this.arrayBody.add(" div[id=cont]");
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
