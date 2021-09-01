package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class DongaDaily extends AbsCrawler {

	public DongaDaily(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "동아일보";
	}
	
	public DongaDaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "동아일보";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=page]");
		this.arrayBody.add(" section[id=contents]");
		this.arrayBody.add(" div[class=article_txt]");
		this.arrayBody.add(" div[class=article_view]");
		this.arrayBody.add(" div[id=copyright]");
		this.arrayBody.add(" div[class=articlePhotoC]");
		this.arrayBody.add(" div[id=container]");
		this.arrayBody.add(" div[class=bestnews_box]");
		this.arrayBody.add(" div[class=article_view]");
		this.arrayBody.add(" div[class=main_news_con]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=article_title]");
		this.arrayTitle.add(" div[class=subheader_box]");
		this.arrayTitle.add(" div[id=subheader]");
		this.arrayTitle.add(" header[class=contents]");
		this.arrayTitle.add(" a[class=title]");
		this.arrayTitle.add(" div[class=tags]");
		this.arrayTitle.add(" div[class=article_keyword]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
