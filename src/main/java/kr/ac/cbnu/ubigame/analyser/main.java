package kr.ac.cbnu.ubigame.analyser;

import clientcrawler.ClientBoth;

public class main {
	public static void main(String[] args) throws Exception {
		try{
		ClientBoth clientboth = new ClientBoth();
		clientboth.startclient();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
