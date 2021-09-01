package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class SundayNews extends AbsCrawler {

	public SundayNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "일요신문";
	}
	
	public SundayNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "일요신문";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=talklink_contents]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=subjectDiv]");
		this.arrayTitle.add(" div[class=subjectWrap]");
		this.arrayTitle.add("title");
		this.arrayTitle.add(" div[id=CmAdContent]");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
