//스트림 결합 : 스트림도 서로 결합 가능.
//스트림을 통하여 흘러가는 데이터에 대해 다양한 가공처리를 할 수 있다. 
//파일 스트림 - 버퍼 스트림 연결
//버퍼가 없는 스트림을 버퍼가 있는 스트림으로 변경하려면 버퍼 스트림 객체를 생성하면서 생성자의 인수로 버퍼가 없는 스트림 객체를 전달하면 된다.

//버퍼 스트림 : 기본 입출력스트림에 버퍼기능을 추가하는 스트림을 의미한다. 
//입력된 데이터가 바로 프로그램으로 전달되지 않고 중간에 버퍼링이 된 후에 전달된다.
//출력도 마찬가지로 버퍼를 거쳐서 간접적으로 출력장치로 전달된다.
//중간버퍼를 사용함으로써 시스템의 데이터처리 효율성을 높여준다.
//버퍼스트림은 이미 생성된 바이트스트림이나 문자스트림에 연결하여 사용한다.
//줄단위 문자열(String) 처리가 가능하다.

//줄 단위로 복사(여기서 줄 : 2byte이상. 한글의 한 글자도 문자열임.
//한 줄 단위로 입출력 하기 위해 BufferedReader와 PrintWriter(or BufferedWriter) 클래스 사용

import java.io.*;
public class CopyLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try( BufferedReader in = new BufferedReader(new FileReader("test.txt")); //File 입출력에 버퍼 기능 추가(입, 출력 따로 설정)
				PrintWriter out = new PrintWriter(new FileWriter("output.txt"))) 
		{
			String line;//문자열
			
			//readLine()은 개행문자가 포함되어야 내부 blocking이 풀리면서 wihle문이 실행한다(개행문자 : 자바는 \n인데 문자열은 예외로 \r\n임. 고로 입력할 때 마지막에 \r\n을 붙혀줘야 하는데...여기서는 안그렇네.
			while (( line = in.readLine()) != null) //하나씩 읽어 버퍼에 모은 뒤 한 줄이 만들어지면 출력. 끊는 기준은 \n이나 파일 끝인듯?(한글자만 있는 한 줄도 가능)
			{
			out.println(line);
			}
		} 
		catch (IOException e) 
		{
				
		}
	}

}
