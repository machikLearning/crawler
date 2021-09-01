package kr.ac.cbnu.ubigame.analyser.common.datatype;

import java.util.Date;

public class WebDatatype {
	private String journal;
	private String targetCompany;
	private String articleTitle;
	private String articleBody;
	private Date date;
	private String targetUrl;
	private String journalId;
	
	
	

	public String GetJournal(){
		return journal;
	}
	public void SetJournal(String press){
		this.journal = press;
	}
	
	public String GetTargetCompany(){
		return targetCompany;
	}
	public void SetTargetCompany(String targetcompany){
		this.targetCompany = targetcompany;
	}
	
	public String GetArticleTitle(){
		return articleTitle;
	}
	public void SetArticleTitle(String articletitle){
		this.articleTitle = articletitle;
	}
	
	public String GetArticleBody(){
		return articleBody;
	}
	public void SetArticleBody(String articlebody){
		this.articleBody = articlebody;
	}
	
	public Date GetDate(){
		return date;
	}
	public void SetDate(Date date){
		this.date = date;
	}
	
	public String GettargetUrl(){
		return targetUrl;
	}
	public void SettargetUrl(String targeturl){
		this.targetUrl = targeturl;
	}
	public String GetJournalId(){
		return journalId;
	}
	public void SetJournalId(String JournalId){
		this.journalId = JournalId;
	}
	
}
