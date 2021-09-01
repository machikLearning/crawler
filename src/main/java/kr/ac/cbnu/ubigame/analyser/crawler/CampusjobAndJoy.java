package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class CampusjobAndJoy extends AbsCrawler {

	public CampusjobAndJoy(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "캠퍼스잡앤조이";
	}
	
	public CampusjobAndJoy(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "캠퍼스잡앤조이";
	}


	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=cont_area]");
		this.arrayBody.add(" div[id=contianer-fluid]");
		this.arrayBody.add(" div[class=pageWrap]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=view_title_wrap]");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
