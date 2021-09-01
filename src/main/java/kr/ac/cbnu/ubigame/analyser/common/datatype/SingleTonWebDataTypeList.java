package kr.ac.cbnu.ubigame.analyser.common.datatype;

import java.util.ArrayList;
import java.util.List;

public class SingleTonWebDataTypeList {
	private static SingleTonWebDataTypeList singleTonWebDataTypeList = new SingleTonWebDataTypeList();
	private List<WebDatatype> webDatatypeList;
	
	
	private SingleTonWebDataTypeList() {
		this.webDatatypeList = new ArrayList<WebDatatype>();
	}
	
	public static SingleTonWebDataTypeList getInstace() {
		return singleTonWebDataTypeList;
	}
	
	public void addWebData(WebDatatype webDatatype) {
		this.webDatatypeList.add(webDatatype);
	}
	
	public List<WebDatatype> getWebDataTypeList(){
		return this.webDatatypeList;
	}
	
	public void clearWebDataTypeList() {
		this.webDatatypeList.clear();
	}


}
