package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class NonAdvertisementFactAll extends AbsCrawler {

	public NonAdvertisementFactAll(String targetURL) throws IOException {
		super(targetURL);
		this.journal = "광고없는언론 팩트올";
		// TODO Auto-generated constructor stub
	}
	public NonAdvertisementFactAll(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "광고없는언론 팩트올";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.arrayBody.add("div[class=txtarea]");
		this.arrayBody.add("html");
		
	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("div[class = titbox] > h1 > strong");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
