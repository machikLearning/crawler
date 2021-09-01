package kr.ac.cbnu.ubigame.analyser.common.datacollector;

import java.io.IOException;
import kr.ac.cbnu.ubigame.analyser.common.datatype.WebDatatype;
import kr.ac.cbnu.ubigame.analyser.common.webdata.AbsWebDataManager;

public abstract class AbsDataCollector {
	protected AbsWebDataManager webDataManager;
	WebDatatype data;

	abstract public void crawlingStart() throws IOException, Exception;
	abstract protected void AddData() throws Exception;

}
