package kr.ac.cbnu.ubigame.analyser.common.datatype;

public class CompanyDatatype {
	private int Id;
	private String CompanyName;
	
	public CompanyDatatype(){
		this.Id=0;
		this.CompanyName=null;
	}
	public String GetCompanyName(){
		return CompanyName;
	}
	public void SetCompanyName(String companyName){
		this.CompanyName = companyName;
	}
	public int GetId(){
		return Id;
	}
	public void SetId(int id){
		this.Id = id;
	}
}
