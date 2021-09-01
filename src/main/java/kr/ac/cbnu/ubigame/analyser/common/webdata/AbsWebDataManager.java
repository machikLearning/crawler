package kr.ac.cbnu.ubigame.analyser.common.webdata;

import java.util.List;

import kr.ac.cbnu.ubigame.analyser.common.datatype.WebDatatype;

public abstract class AbsWebDataManager {
	protected IWebDataDao webDataDao;
	
	abstract public void AddData(List<WebDatatype> list) throws Exception;
	abstract public int checkOverlapData(WebDatatype data);

}
