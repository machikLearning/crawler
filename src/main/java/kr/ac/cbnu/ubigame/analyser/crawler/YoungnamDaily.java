package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class YoungnamDaily extends AbsCrawler {

	public YoungnamDaily(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "영남일보";
	}
	
	public YoungnamDaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "영남일보";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=article_text]");
		this.arrayBody.add(" div[id=article_View_Print]");
		this.arrayBody.add(" div[id=news_textArea]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=article_title]");
		this.arrayTitle.add(" div[class=article_titleZone]");
		this.arrayTitle.add(" li[class=icon_relgisalist1 ellipsis]");
		this.arrayTitle.add(" ul[class=left]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
