package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class BrainBoxBenchMark extends AbsCrawler {

	public BrainBoxBenchMark(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "브레인박스벤치마크";
	}
	
	public BrainBoxBenchMark(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "브레인박스벤치마크";
	}


	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=contents]");
		this.arrayBody.add(" section[class=left]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" article[id=bo_view]");
		this.arrayTitle.add(" div[class=area]");
		this.arrayTitle.add(" header[id=header]");
		this.arrayTitle.add(" div[class=pageinfo]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
