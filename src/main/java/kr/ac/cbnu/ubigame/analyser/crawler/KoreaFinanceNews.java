package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class KoreaFinanceNews extends AbsCrawler {

	public KoreaFinanceNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "한국금융신문";
	}
	
	public KoreaFinanceNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "한국금융신문";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=body word_break]");
		this.arrayBody.add(" div[id=articleBody]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=view_tit_txt]");
		this.arrayTitle.add(" div[class=view_topW]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
