package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class JejudoDaily extends AbsCrawler {

	public JejudoDaily(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "제주도민일보";
	}
	
	public JejudoDaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "제주도민일보";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=articleBody]");
		this.arrayBody.add(" div[class=content border-box]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[id=aht-defalut]");
		this.arrayTitle.add(" div[id=article-header-title]");
		this.arrayTitle.add(" div[class=headline border-box]");
		this.arrayTitle.add(" div[id=article-wrap]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
