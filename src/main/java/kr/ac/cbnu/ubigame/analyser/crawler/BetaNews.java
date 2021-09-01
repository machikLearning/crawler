package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class BetaNews extends AbsCrawler {

	public BetaNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "베타뉴스";
	}
	

	public BetaNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "베타뉴스";
	}


	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" li[id=bbs_3]");
		this.arrayBody.add(" div[id=articleBody]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[id=read_title]");
		this.arrayTitle.add(" div[id=main_center]");
		this.arrayTitle.add(" div[id=joinskmbox]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
