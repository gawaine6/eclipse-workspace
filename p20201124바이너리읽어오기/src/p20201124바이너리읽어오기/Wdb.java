package p20201124바이너리읽어오기;

import java.io.FileInputStream;
import java.io.IOException;

public class Wdb {

	public static void main(String[] args) {
		// 바이너리 파일 읽어와서 화면에 출력하기
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("/Users/k/Desktop/바이트스트림/a.bin");
			int c;
			while((c = in.read()) != -1) {
				System.out.println(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
