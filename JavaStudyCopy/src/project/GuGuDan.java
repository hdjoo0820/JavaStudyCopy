package project;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GuGuDan {
	public static void main(String[] args) {
		FileWriter out = null;
		try {
			out = new FileWriter("myfiles/gugudan.txt");
			for (int i = 2; i <= 9; ++i) {
				for (int j = 1; j <= 9; ++j) {
					out.append(String.format("%d * %d = %2d  ", i, j, j*i));					
				}
				out.append("\n");
			}					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		FileReader in = null;
		try {
			in = new FileReader("myfiles/gugudan.txt");
			int ch;
			while ((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
