package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class GwangjuDaily extends AbsCrawler {

	public GwangjuDaily(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "광주일보";
	}
	
	public GwangjuDaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "광주일보";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated 	method stub
		this.arrayBody.add("div[id=CmAdContent] > div[id=content]");
		this.arrayBody.add("div[id=CmAdContent]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("div[class=tborder] > div[class=rtitle1]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
