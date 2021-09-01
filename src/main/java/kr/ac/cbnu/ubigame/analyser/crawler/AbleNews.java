package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class AbleNews extends AbsCrawler {

	public AbleNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "에이블뉴스";
	}

	public AbleNews(String url, String searchword, Date finalDate) throws IOException {
		super(url,searchword,finalDate);
		// TODO Auto-generated constructor stub
		this.journal = "에이블뉴스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" span[class=PhotoComment]");
		this.arrayBody.add(" div[id=NewsContent]");
		this.arrayBody.add(" div[id=DivNewsPrintArea]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[id=NewsContent]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
