package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class PeopleVoice extends AbsCrawler {

	public PeopleVoice(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "민중의소리";
	}
	
	public PeopleVoice(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "민중의소리";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=articleBody]");
		this.arrayBody.add(" div[id=main]");
		this.arrayBody.add(" div[class=news_article]");
		this.arrayBody.add(" div[id=content]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=topnav-container]");
		this.arrayTitle.add(" div[class=topnav]");
		this.arrayTitle.add(" div[class=sns-header]");
		this.arrayTitle.add(" div[class=header-in]");
		this.arrayTitle.add(" div[class=article-header]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
