package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class CnetKorea extends AbsCrawler {

	public CnetKorea(String targetURL) throws IOException {
		super(targetURL);
		this.journal = "씨넷코리아";
		// TODO Auto-generated constructor stub
	}
	
	public CnetKorea(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "씨넷코리아";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=wpb_wrapper]");
		this.arrayBody.add(" div[class=wpb_text_column wpb_content_element]");
		this.arrayBody.add(" div[class=wpb_text_column wpb_content_element  New_howto_sub_title]");
		this.arrayBody.add(" p[class=p1]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=wf-td]");
		this.arrayTitle.add(" div[class=wf-table]");
		this.arrayTitle.add(" div[class=esg-content eg-post-100157132 eg-mckinley-element-0-a]");
		this.arrayTitle.add(" div[class=esg-entry-content eg-mckinley-content]");
		this.arrayTitle.add(" div[class=wpb_text_column wpb_content_element  New_howto_sub_title]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
