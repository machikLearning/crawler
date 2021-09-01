package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class DaeJeonDaily extends AbsCrawler {

	public DaeJeonDaily(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "대전일보";
	}
	
	public DaeJeonDaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "대전일보";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=fontSzArea]");
		this.arrayBody.add(" div[id=CmAdContent]");
		this.arrayBody.add(" div[class=imgbox]");
		this.arrayBody.add(" div[id=article]");
		this.arrayBody.add(" div[id=newsitem_head]");
		this.arrayBody.add(" div[id=main_news1]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[id=newsitem_head]");
		this.arrayTitle.add(" div[id=main_news1]");
		this.arrayTitle.add("title");



	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
