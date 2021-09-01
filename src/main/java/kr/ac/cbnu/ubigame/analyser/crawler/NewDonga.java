package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class NewDonga extends AbsCrawler {

	public NewDonga(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "신동아";
	}
	
	public NewDonga(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "신동아";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=article_text]");
		this.arrayBody.add(" div[class=view]");
		this.arrayBody.add(" div[id=articleBodyContents]");
		this.arrayBody.add(" div[id=articleBody]");
		this.arrayBody.add(" div[id=left_view]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" li[class=list3]");
		this.arrayTitle.add(" div[class=article_info]");
		this.arrayTitle.add(" div[class=article_header]");
		this.arrayTitle.add(" ul[class=list]");
		this.arrayTitle.add(" div[class=info]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
