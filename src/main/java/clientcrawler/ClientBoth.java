package clientcrawler;

import communicationClient.Client;
import kr.ac.cbnu.ubigame.analyser.datacollector.DataCollector;

public class ClientBoth {
	private DataCollector datacollector;
	private Client client;
	
	public ClientBoth(){
		this.client = new Client();
		this.datacollector = new DataCollector();
	}
	public void startclient(){
		while(true){
			this.client.Acceptmain();
			if(this.client.Getserverstep() == 1){
				this.datacollector.setTargetURL(this.client.getTargetURL());
				this.datacollector.setSearchword(this.client.getSearchword());
			}
//			this.datacollector.setTargetURL("https://search.naver.com/search.naver?query=가스 안전&where=news&ie=utf8&sm=nws_hty&nso=so%3Ar%2Cp%3Afrom20180603to20180610%2Ca%3Aall&sort=2&start=141");
//			this.datacollector.setSearchword("가스 안전");
			try {
				this.datacollector.crawlingStart();	
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(this.datacollector.getOverappedCount());
			this.client.Setclientstep(this.datacollector.Getclientstep());
			this.client.Sendmain();
		}
	}
}