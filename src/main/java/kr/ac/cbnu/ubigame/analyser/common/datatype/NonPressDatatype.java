package kr.ac.cbnu.ubigame.analyser.common.datatype;

import java.util.Date;

public class NonPressDatatype {
	private String targetURL;
	private String articleTitle;
	private Date articleDate;
	private String press;
	
	/**
	 * 
	 * @param url 
	 * @param press
	 * @param date
	 * @param articletitle
	 */
	public NonPressDatatype(String url, String articleTitle, Date date, String press){
		this.targetURL = url;
		this.articleTitle = articleTitle;
		this.articleDate = date;
		this.press = press;
	}
}
