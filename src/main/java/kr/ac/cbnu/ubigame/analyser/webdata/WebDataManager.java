package kr.ac.cbnu.ubigame.analyser.webdata;


import java.util.List;

import kr.ac.cbnu.ubigame.analyser.common.datatype.MapperData;
import kr.ac.cbnu.ubigame.analyser.common.datatype.NonPressDatatype;
import kr.ac.cbnu.ubigame.analyser.common.datatype.WebDatatype;
import kr.ac.cbnu.ubigame.analyser.common.webdata.AbsWebDataManager;
import kr.ac.cbnu.ubigame.analyser.common.webdata.IWebDataDao;

public class WebDataManager extends AbsWebDataManager {
	public WebDataManager(IWebDataDao webDataDao) {
		this.webDataDao = webDataDao;
	}
	
	public WebDataManager(){
		this.webDataDao = new WebDataDao();
	}
	
	@Override
	public void AddData(List<WebDatatype> list) throws Exception{
		this.webDataDao.add(list);
	}

	public int checkOverlapData(WebDatatype data) {
		// TODO Auto-generated method stub
		return this.webDataDao.checkOverlapData(data);
		
	}

	public int ignoreDataInsert(WebDatatype data) {
		// TODO Auto-generated method stub
		return this.webDataDao.ignoreDataInsert(data);
	}

	public void AddMapper(MapperData mapperData) {
		// TODO Auto-generated method s
		this.webDataDao.addAssociationData(mapperData);
		}

	public int getID(String string) {
		// TODO Auto-generated method stub
		return this.webDataDao.getID(string);
	}

	public void addNonPress(NonPressDatatype nd) {
		// TODO Auto-generated method stub
		this.webDataDao.addNonPress(nd);
	}

	public void modifyNonPressDatatype(NonPressDatatype nd) {
		// TODO Auto-generated method stub
		this.webDataDao.modifyNonPressDatatype(nd);
	}

	public int getOverrapedCount() {
		// TODO Auto-generated method stub
		return this.webDataDao.getOverrapedCount();
	}
	
}
