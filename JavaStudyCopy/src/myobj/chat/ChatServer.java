package myobj.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.LinkedList;

public class ChatServer {
	
	static class ListeningThread extends Thread {
		
		Socket s;
		
		public ListeningThread(Socket s) {
			this.s = s;
		}
		
		@Override
		public void run() {
			try (
				InputStreamReader isr = new InputStreamReader(s.getInputStream());
				BufferedReader in = new BufferedReader(isr);	
			){
				while (true) {
					// 서버로부터 무언가 도착하기를 계속 기다리면서 받으면 바로 출력
					System.out.println("\n" + in.readLine() + "\n>>");
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
	}
	
	int count = 0;
	ServerSocket ss;
	MessageShare ms = new MessageShare();
	
	public ChatServer(int port) {
		try {
			ss = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		class ListenThread extends Thread {
			Client client;
			
			public ListenThread(Client client) {
				this.client = client;
			}
			
			@Override
			public void run() {
				System.out.println("듣기 쓰레드 시작됨...");
				try(
					BufferedReader in = client.getInputStream();
				){
					while (true) {
						String message = in.readLine();
						System.out.printf("\"%s\"로부터 도착한 메세지: %s\n",
								client.getId(),
								message);
						
						// MessageShare에 등록된 모든 클라이언트에게 메세지 전달
						ms.sendMessageAll(message);
					}
				} catch(SocketException e) {
					System.out.printf("\"%s\"님의 연결이 만료되었습니다.\n",
							client.getId());
					--count;
					ms.removeClient(client);
					client.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			}
		}	
	}	
	public static void main(String[] args) {
		new ChatServer(9000).start();
	
	}
	
	public void start() {
	
		while (true) {
			try {
				System.out.printf("연결을 기다리는 중...(현재 접속자 %d명)\n", count);
				Socket s = ss.accept();
				
				Client c = new Client(s);
				ms.addClient(c);
				
				// 연결될때마다 연결된 클라이언트의 메세지를 기다리는 쓰레드가 추가된다
				new ListeningThread(s);
				
				++count;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}


class MessageShare {
	LinkedList<Client> allClients = new LinkedList<>();
	
	void sendMessageAll(String message){
		for (Client client : allClients) {
			client.sendMessage(message);
		}
	}
	
	void addClient(Client client) {
		allClients.add(client);
	}
	
	void removeClient(Client client) {
		allClients.remove(client);
	}
	
}






