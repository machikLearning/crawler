package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class BBSNEWS extends AbsCrawler {
	private ArrayList<String> elementTitle;
	private ArrayList<String> elementBody;
	
	public BBSNEWS(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "BBS NEWS";
	}
	

	public BBSNEWS(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal ="BBS NEWS";
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

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.elementBody.add("div[id=articleBody]");
		
	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.elementTitle.add("title");
	}

}
