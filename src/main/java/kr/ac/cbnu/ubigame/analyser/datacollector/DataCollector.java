package kr.ac.cbnu.ubigame.analyser.datacollector;



import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;

import clientcrawler.Clientcrawler;
import communicationServer.CheckList;
import kr.ac.cbnu.ubigame.analyser.common.datacollector.AbsDataCollector;
import kr.ac.cbnu.ubigame.analyser.common.datatype.MapperData;
import kr.ac.cbnu.ubigame.analyser.common.datatype.NonPressDatatype;
import kr.ac.cbnu.ubigame.analyser.common.datatype.SingleTonWebDataTypeList;
import kr.ac.cbnu.ubigame.analyser.common.datatype.WebDatatype;
import kr.ac.cbnu.ubigame.analyser.webdata.WebDataManager;
import kr.ac.cbnu.ubigame.analyser.datacollector.DataCollector;


	
public class DataCollector extends AbsDataCollector {
	private WebDatatype data;
	private WebDataManager webDataManager;
	private Clientcrawler clientcrawler;
	private CheckList sendcl;
	private MapperData mapperData;
	
	/*Datacollector에 step 추가하고 pageurl 추가시킴
	 * 다음에 step에 따라 동작하는 crawlingstart()를 다르게 하면 됩니다
	 * 
	 */
	
	protected void AddData(List<WebDatatype> list){
		try {
			this.webDataManager.AddData(list);
//			this.CreateMapperData(this.webDataManager.getID(this.data.GettargetUrl()));
//			this.webDataManager.AddMapper(this.mapperData);
		} catch(Exception e){
			e.printStackTrace();
			//this.checkAssociationData();
		}
	}

	public int getOverappedCount(){
		return this.webDataManager.getOverrapedCount();
	}

	public DataCollector(){
		this.clientcrawler = new Clientcrawler();
		this.webDataManager = new WebDataManager();
		this.data = new WebDatatype();
	}
	
	public void setTargetURL(String targetURL){
		this.clientcrawler.setTargeturl(targetURL);
	}
	
	public void setSearchword(String searchword){
		this.clientcrawler.setSearchword(searchword);
	}
	
	public void crawlingStart() throws Exception{
		this.clientcrawler.Clientcralwermain();
		if(this.clientcrawler.Getclientstep() == 1){
			this.clientcrawler.OperateTrue();
//			System.out.println(" 언론사 블락 : " + this.clientcrawler.getPressBlock());
//			System.out.println(SingleTonWebDataTypeList.getInstace().getWebDataTypeList().size());
			if(SingleTonWebDataTypeList.getInstace().getWebDataTypeList().size() > 0){
				this.Savedb();
				SingleTonWebDataTypeList.getInstace().clearWebDataTypeList();
			}
			
		}else{
			//System.out.println("검색엔진블락 : " + this.clientcrawler.getSearchEngineBlock());
		}
		this.clientcrawler.Initializewd();
	}
	
	public void setClientstep(int i){
		this.clientcrawler.setClientstep(i);
	}
	
	public int Getclientstep(){
		return this.clientcrawler.Getclientstep();
	}

	public CheckList Getsendcl(){
		return this.sendcl;
	}
	
	public void Savedb(){
			this.AddData(SingleTonWebDataTypeList.getInstace().getWebDataTypeList());	
	}
	
	private void CreateMapperData(int num) {
		// TODO Auto-generated method stub
		this.mapperData = new MapperData(this.data.GetTargetCompany(), num);
	}

	@Override
	protected void AddData() throws Exception {
		// TODO Auto-generated method stub
		
	}

	/*
	private void modifyNonPress(NonPressDatatype nd) {
		// TODO Auto-generated method stub
		this.webDataManager.modifyNonPressDatatype(nd);
	}
	
	public void saveNonPress(){
		this.nonPressDatatype = this.clientcrawler.getNonPressArrayList();
		for(NonPressDatatype nd : this.nonPressDatatype){
			try{
				this.webDataManager.addNonPress(nd);
			}catch(Exception e){
				continue;
			}
		}
		
	}
	
	private int checkAssociationData() {
		// TODO Auto-generated method stub
		int num = 0;
		if(webDataManager.checkOverlapData(this.data) == 0){
			num = webDataManager.ignoreDataInsert(this.data);
		}
		return num;
	}
	
	
	*/
	

}


	