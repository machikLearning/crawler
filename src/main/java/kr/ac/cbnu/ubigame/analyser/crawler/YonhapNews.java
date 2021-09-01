package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class YonhapNews extends AbsCrawler {

	public YonhapNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "연합뉴스";
	}
	
	public YonhapNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "연합뉴스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=article-img]");
		this.arrayBody.add(" div[class=article]");
		this.arrayBody.add(" div[id=articleBodyContents]");
		this.arrayBody.add(" div[id=main_content]");
		this.arrayBody.add(" div[id=articleBody]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" li[class=list3]");
		this.arrayTitle.add(" div[id=articleWrap]");
		this.arrayTitle.add(" div[class=contents-box view-wrap]");
		this.arrayTitle.add(" div[id=articleWrap]");
		this.arrayTitle.add(" div[class=article_info]");
		this.arrayTitle.add(" div[class=article_header]");
		this.arrayTitle.add(" li[class=list1]");
		this.arrayTitle.add(" div[class=stit]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
