package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class NewsTomato extends AbsCrawler {

	public NewsTomato(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "뉴스토마토";
	}
	
	public NewsTomato(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "뉴스토마토";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" li[class=wn]");
		this.arrayBody.add(" div[class=rn_sti_case]");
		this.arrayBody.add(" div[class=rns_text][id=]");
		this.arrayBody.add(" head[id=ctl00_Head1]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=rn_sti_case]");
		this.arrayTitle.add(" head[id=ctl00_Head1]");
		this.arrayTitle.add(" li[class=wn]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
