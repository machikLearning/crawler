package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class WorldDaily extends AbsCrawler {

	public WorldDaily(String targetURL) throws IOException {
		super(targetURL);
		this.journal = "세계일보";
		// TODO Auto-generated constructor stub
	}
	
	public WorldDaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "세계일보";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" form[id=viewFrm]");
		this.arrayBody.add(" div[class=news_article]");
		this.arrayBody.add(" div[id=articleBody]");
		this.arrayBody.add(" div[id=content]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=subject]");
		this.arrayTitle.add(" div[class=article_head]");
		this.arrayTitle.add(" div[class=tb_wrap]");
		this.arrayTitle.add(" div[id=topb]");
		this.arrayTitle.add(" div[id=HeadingBox]");
		this.arrayTitle.add(" div[class=Leftcon_view]");
		this.arrayTitle.add(" header[class=article-header]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
