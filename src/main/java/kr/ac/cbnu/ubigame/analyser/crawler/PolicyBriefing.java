package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class PolicyBriefing extends AbsCrawler {

	public PolicyBriefing(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "정책브리핑";
	}
	
	public PolicyBriefing(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "정책브리핑";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=view_cont]");
		this.arrayBody.add(" div[class=policy-view]");
		this.arrayBody.add(" div[id=cont-2s]");
		this.arrayBody.add(" div[class=article_content]");
		this.arrayBody.add(" div[class=body view]");
		this.arrayBody.add(" div[class=view_cont]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=ah_subject]");
		this.arrayTitle.add(" div[class=article_head]");
		this.arrayTitle.add(" div[class=nuri ]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
