package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class SportsDonga extends AbsCrawler {

	public SportsDonga(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "스포츠동아";
	}
	
	public SportsDonga(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "스포츠동아";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=ct]");
		this.arrayBody.add(" div[id=articleBody]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=article_tit]");
		this.arrayTitle.add(" div[id=ct]");
		this.arrayTitle.add(" div[class=article_word]");
		this.arrayTitle.add("title");
	

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
