import java.io.*;

//스트림 : "바이트들의 연속적인 흐름" -> 입출력을 물의 흐름으로 간주하는 것.(파일 입출력)
//스트림의 종류 : java.io 안에 스트림을 지원하는 클래스들이 있다.
//바이트 스트림, 문자 스트림으로 분류할 수 있다. (바이트 : InputStream, OutputStream 문자 : Reader, Writer)

//바이트 스트림 : 바이트 단위로 입출력. 이진 데이터를 읽고 쓰기 위해 사용.
//모든 바이트 스트림 클래스들은 추상 클래스인 InputStream과 OutputStream에서 파생됨.
//바이트 스트림 클래스 이름에는 InputStream과 OuputStream이 붙는다.
//당연한 얘기지만 추상 클래스를 상속 받으면 아래의 추상 메소드들을 재정의 해야한다.
//InputStream의 추상 메소드들
//int read() : 한 바이트를 읽어서 반환(0~255). 파일의 끝일 경우 -1 반환
//OutputStream의 추상 메소드들
//void write(int b) : 한 바이트를 특정한 장치에 입력
//스트림의 읽기, 쓰기가 끝났으면 close()를 호출해서 스트림을 닫아야한다. 

//문자 스트림 : 문자 단위로 입출력
//기본 추상 클래스인 Reader, Writer 클래스에서 파생됨. 모든 문자 스트림 클래스들은 이를 상속해야한다.
//유니코드 데이터를 처리하는 Reader와 Writer클래스는 다음과 같은 기본적인 메소드를 갖고 있음.
//int read() : 한 문자를 읽고 반환
//void write(int c) : 한 문자를 특정한 장치에 입력.
//파일 입출력 문자 스트림 : 파일에서 문자를 읽거나 쓰려면 FileReader, FileWriter 클래스를 사용한다. 

//txt파일 읽고 화면에 출력하는 프로그램
public class FileReaderExample {
	
	//자바는 입출력에서 깐깐한 모습을 보여준다. 
	//prinln 등의 함수는 예외 처리를 안해도 넘어갔는데 이 외의 경우는 얄짤없다. 
	//그래서 throws Exception으로 예외 처리를 해줘야 컴파일 에러가 뜨지 않는다. 
	public static void main(String[] args) //throws Exception //main을 호출하는 함수에게 예외를 전가. try-catch를 쓰지 않을 경우 이걸 쓴다. 
	//try-catch를 쓴다면 throws Exception를 쓰지 않는다. 둘 중 하나는 반드시 해줘야한다.
	{
		// TODO Auto-generated method stub
//		FileReader fr = new FileReader("input.txt"); //읽을 파일 불러오기. 얘가 예외(파일 못읽는 상황 등)를 유발
//		
//		int ch;//문자내용 담을 정수
//		while((ch = fr.read()) != -1)//끝이 보일 때까지 읽기
//		{
//			System.out.print((char)ch);//읽을 때 마다 출력
//		}
//		fr.close();//다 읽었으니 닫기
		
		//try-with-resources 사용
		//try문 안에 리소스를 지정하면 리소스의 사용이 끝났을 때 자동으로 닫아준다.(close() 자동으로 해줌)
		//close()를 따로 호출하지 않아도 자동으로 호출된다. 
		try (FileReader fr = new FileReader("input.txt")) //FileReader 불러오기 시도
		{
			int ch;
			while ((ch = fr.read()) != -1) 
				System.out.print((char) ch);
		} 
		catch (IOException e) //try에서 예외 발생
		{ 
			e.printStackTrace();//처리
		}
	}

}
