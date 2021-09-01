package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class NocutNews extends AbsCrawler {
	public NocutNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "노컷뉴스";
	}

	public NocutNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "노컷뉴스";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.arrayBody.add("div[class=content] > div[id=pnlViewBox] > div[id=pnlViewTop]");
		this.arrayBody.add("div[class=content]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("title");
		this.arrayTitle.add("div[class=gnb_con] > h2");
		this.arrayTitle.add("div[class=class=gnb_con]");
		
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
