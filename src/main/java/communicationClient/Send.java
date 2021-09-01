package communicationClient;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import communicationServer.CheckList;

public class Send {
	private int clientstep;
	private CheckList cl;
	private Socket socket;
	private ObjectOutputStream oos;
	final String ClientIP = "52.78.120.182";
	final String ServerIP = "210.115.170.132";
	final int port = 3082;
	final int extraport = 3083;
	
	public Send(){
		socket = null;
		oos = null;
		this.cl = null;
		this.clientstep = 0;
	}
	
	/**
	 * Server로 Client의 상태 입력
	 */
	
	public void Sendmain(){
		try {
			System.out.println("서버로 접속 요청중");
			this.socket  = new Socket(ServerIP,port);
			this.oos = new ObjectOutputStream(this.socket.getOutputStream());
			this.oos.reset();
			this.oos.writeObject(this.cl);
			Close();
		} catch (Exception e) {
			e.printStackTrace();
			SendExtra();
		}
		
		System.out.println("서버접속종료");
	}
	
	/**
	 * Server 기본 포트가 사용중이면 extra포트로 연결 요청
	 */
	public void SendExtra(){
		try {
			this.socket  = new Socket(ServerIP,extraport);
			this.oos = new ObjectOutputStream(this.socket.getOutputStream());
			this.oos.reset();
			this.oos.writeObject(this.cl);
			Close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 사용되었던 ObjectOutputStream 과 socket 정리
	 */
	public void Close() {
		try {
			this.oos.close();
			this.socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * int형 파라미터 사용
	 * clientstep 초기화
	 * @param getclientstep
	 */
	public void Setserverstep(int getclientstep) {
		this.clientstep = getclientstep;
	}

	/**
	 * Server로 보낼 파일 형식인 CheckList 객체 생성 상태 입력
	 */
	public void Makesendcl() {
		this.cl = new CheckList();
		this.cl.SetIP(this.ClientIP);
		this.cl.Setstep(this.clientstep);
	}
}
