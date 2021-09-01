package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class KoreaDaily extends AbsCrawler {

	public KoreaDaily(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "한국일보";
	}
	
	public KoreaDaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "한국일보";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=article-view-content-div]");
		this.arrayBody.add(" article[class=article-veiw-body view-page]");
		this.arrayBody.add(" div[class=DetailCon]");
		this.arrayBody.add(" article[id=article-body]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayBody.add(" header[class=article-header-wrap]");
		this.arrayBody.add(" header[class=article-view-header]");
		this.arrayTitle.add(" div[class=newsStoryTit]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
