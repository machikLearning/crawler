package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class DigitalTimes extends AbsCrawler {

	public DigitalTimes(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "디지털타임스";
	}
	
	public DigitalTimes(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "디지털타임스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=resizeContents]");
		this.arrayBody.add(" div[id=gisa]");
		this.arrayBody.add(" div[id=NewsAdContent]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[id=news_names]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
