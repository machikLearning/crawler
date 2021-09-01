package communicationClient;

import communicationServer.CheckList;

public class Client {
	private Accept accept;
	private Send send;
	private CheckList sendcl;
	
	public Client(){
		accept = new Accept();
		send = new Send();	
	}
	
	public void Acceptmain(){
		this.accept.Connection();
		this.accept.Seebody();
		
	}
	
	public String getSearchword(){
		return accept.getSearchword();
	}
	
	public String getTargetURL(){
		return accept.getTargetURL();
	}
	
	public int Getserverstep(){
		return accept.Getserverstep();
	}
	
	public void Sendmain(){
		send.Makesendcl();
		send.Sendmain();
	}
	
	public void SetSendcl(CheckList cl){
		this.sendcl = cl;
	}

	public void Setclientstep(int getclientstep) {
		this.send.Setserverstep(getclientstep);
	}

}
