package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class BuddhismNews extends AbsCrawler {

	public BuddhismNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "불교공뉴스";
	}
	
	public BuddhismNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "불교공뉴스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=article-view-content-div]");
		this.arrayBody.add(" article[class=article-veiw-body view-page]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" header[class=article-header-wrap]");
		this.arrayTitle.add(" header[class=article-view-header]");
		this.arrayTitle.add(" div[class=aht-wrapper ]");
		this.arrayTitle.add(" div[id=article-header-title]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
