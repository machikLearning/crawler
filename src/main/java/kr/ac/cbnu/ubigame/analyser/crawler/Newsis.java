package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class Newsis extends AbsCrawler {

	public Newsis(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "뉴시스";
	}
	
	public Newsis(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "뉴시스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" li[class=list3]");
		this.arrayBody.add(" div[id=articleBody]");
		this.arrayBody.add(" div[id=main_content]");
		this.arrayBody.add(" li[class=list2]");
		this.arrayBody.add(" ul[class=type04][id=]");
		this.arrayBody.add(" div[class=view_text]");
		this.arrayBody.add(" div[class=article_bx]");
		this.arrayBody.add(" div[id=textBody]");
		this.arrayBody.add(" div[class=article_info]");
		this.arrayBody.add(" div[class=article_header]");
		this.arrayBody.add(" div[class=article_tbx mgt8 w970]");
		this.arrayBody.add(" div[id=article]");
		this.arrayBody.add(" html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" li[class=list3]");
		this.arrayTitle.add(" div[class=article_bx]");
		this.arrayTitle.add(" div[id=articleBody]");
		this.arrayTitle.add(" div[id=main_content]");
		this.arrayTitle.add(" div[id=textBody]");
		this.arrayTitle.add(" div[class=view_text]");
		this.arrayTitle.add(" div[class=article_info]");
		this.arrayTitle.add(" div[class=article_header]");
		this.arrayTitle.add(" li[class=list2]");
		this.arrayTitle.add(" ul[class=type04]");
		this.arrayTitle.add(" div[class=article_tbx mgt8 w970]");
		this.arrayTitle.add(" div[id=article]");
		this.arrayBody.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
