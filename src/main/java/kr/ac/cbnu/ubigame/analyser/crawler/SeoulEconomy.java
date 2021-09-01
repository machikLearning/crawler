package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class SeoulEconomy extends AbsCrawler {

	public SeoulEconomy(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "서울경제";
	}
	
	public SeoulEconomy(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "서울경제";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=articleBodyContents]");
		this.arrayBody.add(" div[id=articleBody]");
		this.arrayBody.add(" div[id=articleBodyContents]");
		this.arrayBody.add(" div[id=articleBody]");
		this.arrayBody.add(" div[id=main_content]");
		this.arrayBody.add(" div[class=view_con]");
		this.arrayBody.add(" div[id=articleBodyContents]");
		this.arrayBody.add(" div[id=articleBodyContents]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" li[class=list3]");
		this.arrayTitle.add(" div[id=v-left-scroll-in]");
		this.arrayTitle.add(" div[id=v-left-scroll-start]");
		this.arrayTitle.add(" div[class=article_info]");
		this.arrayTitle.add(" div[class=article_header]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
