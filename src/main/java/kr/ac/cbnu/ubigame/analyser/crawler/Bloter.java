package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class Bloter extends AbsCrawler {

	public Bloter(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "블로터";
	}
	
	public Bloter(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "블로터";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=liveblog-entry-text]");
		this.arrayBody.add(" div[class=article--content]");
		this.arrayBody.add(" div[class=category]");
		this.arrayBody.add(" div[class=denim-layout--]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=denim-layout--]");
		this.arrayTitle.add(" header[class=article--header]");
		this.arrayTitle.add(" h1[class=article-box-title]");
		this.arrayTitle.add(" article[class=related-post--article]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
