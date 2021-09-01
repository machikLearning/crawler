package communicationClient;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import communicationServer.CheckList;

public class Accept {
	private int serverstep;
	private ServerSocket serverSocket;
	private ObjectInputStream in;
	final int port = 3080;
	private String targetURL;
	private String searchword;
	private CheckList cl;
	
	public Accept(){
		this.serverstep = 0;
		this.in = null;
		serverSocket = null;
		cl = null;
		targetURL = null;
		this.searchword = null;
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Connection(){
		InputStream is = null;
		Socket socket = null;
		try {
			socket = serverSocket.accept();
			is = socket.getInputStream();
			this.in = new ObjectInputStream(is);
			Checkbody();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				is.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
				
		}
			
	}
	
	public void Checkbody() {
		try {
			this.cl = (CheckList)this.in.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Seebody(){
		this.serverstep = this.cl.Getstep();
		this.targetURL = this.cl.Gettargeturl();
		this.searchword = this.cl.getSearchword();
	}

	public String getTargetURL(){
		return this.targetURL;
	}
	
	public int Getserverstep(){
		return this.serverstep;
	}
	
	public String getSearchword(){
		return this.searchword;
	}
}
