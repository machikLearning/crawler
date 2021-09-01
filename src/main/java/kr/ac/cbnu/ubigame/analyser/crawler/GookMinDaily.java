package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;
public class GookMinDaily extends AbsCrawler{

	public GookMinDaily(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "국민일보";
	}

	public GookMinDaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "국민일보";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.arrayBody.add("div[id=article ] > div[id=articleBody]");
		this.arrayBody.add("div[class=nws_arti2]");
		this.arrayBody.add("div[id=news_body_area]");
		this.arrayBody.add("div[class=news_body_area]");
		this.arrayBody.add("html");
		
	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("title");
		this.arrayTitle.add("div[class=nwsti] > h3");
		this.arrayTitle.add("div[class=hbox] > h2");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
