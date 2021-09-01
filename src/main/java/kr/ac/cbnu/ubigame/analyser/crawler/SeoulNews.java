package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class SeoulNews extends AbsCrawler {

	public SeoulNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "서울신문";
	}
	
	public SeoulNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "서울신문";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=content]");
		this.arrayBody.add(" div[class=atic_cnt]");
		this.arrayBody.add(" div[id=article_content]");
		this.arrayBody.add(" div[id=atic_txt1]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=atic_title]");
		this.arrayTitle.add(" div[class=innerDiv]");
		this.arrayTitle.add(" div[class=atic_title]");
		this.arrayTitle.add(" div[class=Vtit_box]");
		this.arrayTitle.add(" div[class=article_tit]");
		this.arrayTitle.add(" h3[class=title_main]");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
