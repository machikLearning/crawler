package kr.ac.cbnu.ubigame.analyser.common.webdata;


import java.util.List;

import kr.ac.cbnu.ubigame.analyser.common.datatype.MapperData;
import kr.ac.cbnu.ubigame.analyser.common.datatype.NonPressDatatype;
import kr.ac.cbnu.ubigame.analyser.common.datatype.WebDatatype;

public interface IWebDataDao {
	public void add(WebDatatype webDatatype) throws Exception;
	public void addAssociationData(MapperData mapperData);
	public int checkOverlapData(WebDatatype webDatatype);
	public int ignoreDataInsert(WebDatatype data);
	public int getID(String string);
	public void addNonPress(NonPressDatatype nd);
	public void modifyNonPressDatatype(NonPressDatatype nd);
	public void add(List<WebDatatype> list);
	public int getOverrapedCount();
	
}
