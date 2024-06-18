package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class E10_FileEncryption{
	/*
	  	frankenstein.txt를 시저 암호방식으로 암호화한 새 파일
	  	frankenstein_encrypted.enc을 생성해보세요
	  	
	  	(1) char 단위로 한 글자씩 암호화하는 속도를 측정해보기
	  	
	  	(2) char[] 방식으로 암호화하는 속도를 측정해보기
	  	
	  	(3) Buffered 클래스를 붙여 암호화하는 속도를 측정해보기
	  	
	  	(4) 이미 같은 이름의 결과 파일이 경로에 존재한다면
	  	    파일의 이름 뒤에 (숫자)를 붙여 다음 파일이 생기게 만들기
	  	    
	  	    frankenstein_encrypted(1).enc
	  	    frankenstein_encrypted(2).enc
	  	    frankenstein_encrypted(3).enc...
	  	    
	*/
	public static void main(String[] args) {
		File bookFile = new File("myfiles/frankenstein.txt");
		File saveFile = new File("myfiles/frankenstein_encrypted.enc");
		File saveFile2 = new File("myfiles/frankenstein_encrypted2.enc"); 
		File saveFile3 = new File("myfiles/frankenstein_encrypted3.enc");
				
		D10_CaesarCipher_T cipher1 = new D10_CaesarCipher_T();
				
		int key = 3;
	
		try(
			FileReader in = new FileReader(bookFile);
			FileWriter out = new FileWriter(saveFile);
		){
			int ch;
			while ((ch = in.read()) != -1) {				
				
				out.write(cipher1.encrypt2((char)in.read(), key));

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		try (
			FileReader in2 = new FileReader(bookFile);	
			FileWriter out2 = new FileWriter(saveFile2);	
		){
			
			char[] buff = new char[1000];
				
				int len;
				
				while ((len = in2.read(buff)) != -1) {
					String ori2 = new String(buff, 0, len);
					String ecy2 = cipher1.encrypt(ori2, key);
					out2.write(ecy2);
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		try (
			FileReader fin = new FileReader(bookFile);
			BufferedReader in3 = new BufferedReader(fin);
			FileWriter fout = new FileWriter(saveFile3);
			BufferedWriter out3 = new BufferedWriter(fout)
		){
			String line;
			while ((line = in3.readLine()) != null) {
				out3.write(cipher1.encrypt(line, key));
				out3.write("\n");
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
	}
	
}
