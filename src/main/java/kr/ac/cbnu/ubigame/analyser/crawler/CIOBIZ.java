package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class CIOBIZ extends AbsCrawler {

	public CIOBIZ(String targetURL) throws IOException {
		super(targetURL);
		this.journal = "CIOBIZ+";
		// TODO Auto-generated constructor stub
	}

	public CIOBIZ(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url, searchword,finalDate);
		this.journal ="CIOBIZ+";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.arrayBody.add("section[id=articleBody]");
		this.arrayBody.add("section[class= article_body]");

	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("h2[class=article_title]");
		this.arrayTitle.add("title");
	}

	@Override
	public String bodyCrawler() throws IOException {
		// TODO Auto-generated method stub
		String result = this.iterator(this.arrayBody);
		return result;
	}

	@Override
	public String journalIDSearch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
