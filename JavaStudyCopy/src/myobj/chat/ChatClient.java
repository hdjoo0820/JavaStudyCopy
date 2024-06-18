package myobj.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ChatClient {
	
	public static void main(String[] args) {
		try {
			Socket s = new Socket("192.168.0.16", 9000);
			
			// 데이터 듣기 쓰레드 (서버에서 부터 메세지를 받아오는 쓰레드)
			
			
			System.out.println("서버에 연결되었습니다!");
			try(
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(isr);
				PrintStream out = new PrintStream(s.getOutputStream());
			){
				// 데이터 쓰기 쓰레드 (서버로 채팅을 전송할 쓰레드)
				while (true) {
					System.out.print(" >>");
					out.println(in.readLine());
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
