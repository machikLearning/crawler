package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class LegalNews extends AbsCrawler {

	public LegalNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "법률신문";
	}
	
	public LegalNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "법률신문";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" section[id=contents]");
		this.arrayBody.add(" section[class=article-contents]");
		this.arrayBody.add(" section[class=sub-left]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" header[class=article-header]");
		this.arrayTitle.add(" section[class=article]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
