package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class OhMyNews extends AbsCrawler {

	public OhMyNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "오마이뉴스";
	}
	
	public OhMyNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "오마이뉴스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=at_contents]");
		this.arrayBody.add(" div[class=article_view]");
		this.arrayBody.add(" div[class=news_view]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" li[class=on]");
		this.arrayTitle.add(" ul[class=list_stop]");
		this.arrayTitle.add(" td[class=cssDesc]");
		this.arrayTitle.add(" head[id=ctl00_Head1]");
		this.arrayTitle.add(" h3[class=tit_subject]");
		this.arrayTitle.add(" div[class=newstitle]");
		this.arrayTitle.add(" header[class=clearfixafter]");
		this.arrayTitle.add(" div[class=header-wrap follow]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
