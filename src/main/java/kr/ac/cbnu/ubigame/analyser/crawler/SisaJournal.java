package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class SisaJournal extends AbsCrawler {

	public SisaJournal(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "시사저널";
	}
	
	public SisaJournal(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "시사저널";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=arDetail]");
		this.arrayBody.add(" section[class=articleCont after]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=newscontTit]");
		this.arrayTitle.add(" div[class=newscontWrap newscontWrap2]");
		this.arrayTitle.add(" div[class=articleWrap]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
