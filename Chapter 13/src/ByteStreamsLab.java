//이미지 파일 분석
//이미지 파일은 이진 파일이다. 즉, 데이터가 이진수 형식으로 저장되어 있다.
//바이트 스트림을 처리하는 FileInputStrema과 FileOutputStream 클래스를 사용한다. 

import java.io.*;
import java.util.*;

public class ByteStreamsLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일 이름을 프록그램에 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("원본 파일 이름을 입력하시오: "); 
		String inputFileName = scan.next(); 
		System.out.print("복사 파일 이름을 입력하시오: "); 
		String outputFileName = scan.next();
		
		//파일 처리(inputStream, outputStream을 생성하며 try(알아서 close() 해줌)
		try (InputStream inputStream = new FileInputStream(inputFileName); 
				OutputStream outputStream = new FileOutputStream(outputFileName)) 
		{
			int c;
			while ((c = inputStream.read()) != -1) //입력용으로 받은 file을 다 읽을 때까지.
			{
				outputStream.write(c);//복사할 파일에 이미지 정보를 입력
			}
			
		} 
		catch (IOException e) //예외 발생(파일 생성 못하거나 뭐 파일 못읽거나 등)
		{
			e.printStackTrace();
		}
		System.out.println(inputFileName + "을 " + outputFileName + "로 복사하였습니다. ");
	}

}
