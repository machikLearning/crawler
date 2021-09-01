package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class DaeGuDaily extends AbsCrawler {

	public DaeGuDaily(String targetURL) throws IOException {
		super(targetURL);
		this.journal = "대구일보";
	}
	
	public DaeGuDaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "대구일보";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" [id=CmAdContent]");
		this.arrayBody.add(" div[class=entry-post]");
		this.arrayBody.add(" div[class=main-post]]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add(" div[class=head-post]");
		this.arrayTitle.add(" article[class=post]");
		this.arrayTitle.add(" div[id=CmAdContent]");
		this.arrayTitle.add(" div[class=entry-post]");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}
}
