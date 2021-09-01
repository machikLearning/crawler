package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class SportsWorld extends AbsCrawler {

	public SportsWorld(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "스포츠월드";
	}
	
	public SportsWorld(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "스포츠월드";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=article_content]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=Leftcon_view]");
		this.arrayTitle.add(" div[class=Contents_Container]");
		this.arrayTitle.add(" div[id=HeadingBox]");
		this.arrayTitle.add(" div[id=article_content]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
