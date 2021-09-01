package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class MetroNews extends AbsCrawler {

	public MetroNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "메트로뉴스";
	}
	
	public MetroNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "메트로뉴스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" dl[class=center_img]");
		this.arrayBody.add(" div[class=viewMarginLeft]");
		this.arrayBody.add(" div[class=newsview-box]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=news_topBox]");
		this.arrayTitle.add(" div[class=body-left-box]");
		this.arrayTitle.add(" div[id=CmAdContents]");
		this.arrayTitle.add(" div[id=view_top_bar]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}
}
