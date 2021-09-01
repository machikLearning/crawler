package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class SisaJournalEconomy extends AbsCrawler {

	public SisaJournalEconomy(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "시사저널이코노미";
	}
	
	public SisaJournalEconomy(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "시사저널이코노미";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" section[class=articleContent]");
		this.arrayBody.add(" section[class=articleView]");
		this.arrayBody.add(" div[class=inWrap]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=contentSect type1]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
