package kr.ac.cbnu.ubigame.analyser.common.datatype;

public class MapperData {
	private String searchWord;
	private int articleID;
	
	public MapperData(String searchWord, int articleID){
		this.searchWord = searchWord;
		this.articleID = articleID;
	}
	
	public void setSearchWord(String searchWord){
		this.searchWord = searchWord;
	}
	
	public void setArticleID(int articleID){
		this.articleID = articleID;
	}
	
	public String getSearchWord(){
		return this.searchWord;
	}
	
	public int getArticleID(){
		return this.articleID;
	}
}
