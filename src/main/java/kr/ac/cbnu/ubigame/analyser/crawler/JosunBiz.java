package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class JosunBiz extends AbsCrawler {

	public JosunBiz(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "조선비즈";
	}
	
	public JosunBiz(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "조선비즈";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=content]");
		this.arrayBody.add(" div[id=article_2011]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=title_author_2011]");
		this.arrayTitle.add(" div[class=art_title_2011]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
