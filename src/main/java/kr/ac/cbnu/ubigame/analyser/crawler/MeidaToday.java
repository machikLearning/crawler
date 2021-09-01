package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class MeidaToday extends AbsCrawler {

	public MeidaToday(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "미디어오늘";
	}
	
	public MeidaToday(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "미디어오늘";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=arl_view_content]");
		this.arrayBody.add(" td[id=font_imgdown_154457]");
		this.arrayBody.add(" div[id=talklink_contents]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=arl_view_title_box]");
		this.arrayTitle.add(" div[id=arl_view_box]");
		this.arrayTitle.add(" div[class=border_box height_auto fmb_in]");
		this.arrayTitle.add(" div[id=float_menu_box]");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
