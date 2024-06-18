package database;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class J10_Naver {
	
	public static void main(String[] args) {
		
		JFrame fr = new JFrame();
		fr.setSize(300, 200);
		fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
		
		JButton bt = new JButton("웹 페이지 열기");
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				openWebpage("https://www.naver.com");
				
			}
			
		
				
		});
		
		fr.getContentPane().add(bt);
		fr.setVisible(true);
	
	}
	
	private static void openWebpage(String urlString) {
		try {
            URI uri = new URI(urlString);
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(uri);
            } else {
                System.out.println("데스크탑 브라우저를 지원하지 않습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	
}