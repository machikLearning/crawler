package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class MsPleNews extends AbsCrawler {

	public MsPleNews(String targetURL) throws IOException {
		super(targetURL);
		this.journal = "엠스플뉴스";
		// TODO Auto-generated constructor stub
	}
	
	public MsPleNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "엠스플뉴스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=board_view]");
		this.arrayTitle.add(" div[id=sub_contents]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}
}
