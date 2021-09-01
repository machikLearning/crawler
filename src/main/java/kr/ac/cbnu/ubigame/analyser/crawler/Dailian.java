package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class Dailian extends AbsCrawler {

	public Dailian(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "데일리안";
	}
	
	public Dailian(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "데일리안";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=view_page]");
		this.arrayBody.add(" div[id=content1]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[id=article_title]");
		this.arrayTitle.add(" div[id=topBarWrap_mid]");
		this.arrayTitle.add(" div[id=view_titlebox_r]");
		this.arrayTitle.add(" div[id=view_titlebox]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
