package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class ChungBukDaily extends AbsCrawler {

	public ChungBukDaily(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "충북일보";
	}
	
	public ChungBukDaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "충북일보";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=news_body_area]");
		this.arrayBody.add(" div[class=cnt_view]");
		this.arrayBody.add(" div[class=article]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=art_tit]");
		this.arrayTitle.add(" div[class=art_top_wrap]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}
}
