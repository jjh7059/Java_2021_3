package xyz.itwill.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//원본파일에 저장된 값을 원시 데이터로 읽어 대상파일에 전달하여 저장하는 프로그램
// => 모든 파일 복사 가능
public class CopyByteApp {
	public static void main(String[] args) throws IOException {
		//BufferedInputStream : InputStream 인스턴스를 전달받아 대령의 원시 데이터를 얻어
		//오는 기능을 제공하는 입력 스트림을 생성하기 위한 확장 클래스
		BufferedInputStream in = null;
		
		//BufferedOutputStream : OutputStream 인스턴스를 전달받아 대령의 원시 데이터를 전달
		//하는 기능을 제공하는 출력 스트림을 생성하기 위한 확장 클래스
		BufferedOutputStream out = null;
		
		try {
			//in = new BufferedInputStream(new FileInputStream("c:/data/zoom.txt"));
			//out = new BufferedOutputStream(new FileOutputStream("c:/data/zoom_byte.txt"));
			
			in = new BufferedInputStream(new FileInputStream("c:/data/back.jpg"));
			out = new BufferedOutputStream(new FileOutputStream("c:/data/back_byte.jpg"));
			
			int readByte;
			while(true) {
				readByte = in.read();
				if(readByte == -1) break;
				out.write(readByte);
			}
			
			System.out.println("[메시지]파일을 성공적으로 복사 하였습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("[에러]원본 파일을 찾을 수 없습니다.");
		} finally {
			if(in != null) in.close();
			if(out != null) out.close();
		}
	}
}
