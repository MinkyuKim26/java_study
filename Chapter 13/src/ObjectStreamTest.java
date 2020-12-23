import java.io.*; 
import java.util.*;

//객체 저장하기
//자바는 '객체 직렬화'라고 하는 메커니즘을 가짐.
//직렬화(serialization) : 객체가 가진 데이터를 순차적인 데이터로 변환.
//표준 클래스들은 대부분 직렬화를 지원. 개인적으로 만든 클래스에 직렬화를 구현하고 싶으면 Serializable 인터페이스 구현
//역직렬화(deserialization) : 직렬화된 데이터를 읽어 역으로 직렬화 -> 순차적인 데이터를 객체 형태로 복구하는 것.
//직렬화 해놓고 파일에 저장한 다음 불러올 때 역직렬화로 다시 객체로 사용할 수 있다.
//(게임 만들 때 직렬화로 저장하고 불러온 다음 역직렬화 해서 쓰던거 생각하자.)

//ObjectStream 클래스 : 객체의 입출력 지원
//이 객체를 이용해 객체를 파일에 저장할 수 있고 반대로 파일에 저장된 객첼르 읽어들일 수 있다. 

//Date 객체 저장.
public class ObjectStreamTest {

	void test() throws IOException
	{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat"));
		
	}
	public static void main(String[] args) throws IOException{ //파일 입출력 예외 처리
		// TODO Auto-generated method stub
		//저장할 애, 읽을 애 선언(초기화는 아직 안함)
		ObjectInputStream in = null; 
		ObjectOutputStream out = null;
		
		try //try만 사용 -> 파일을 오픈하며 try하는게 아니기에 따로 close 해줘야한다.(finally에서 시행함)
		{
			//저장하기 위해 dat파일 생성
			int c;
			out = new ObjectOutputStream(new FileOutputStream("object.dat")); //object.dat을 생성해 파일을 기록할 준비
			out.writeObject(new Date()); // new Date() 객체를 파일에 저장. 
			out.flush();
			//flush()는 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
			//buffer가 다 차기 전에 프로그램을 종료하면 buffer에 들어있는 내용은 파일에 쓰여지지 않는다.
			//그 때 flush()를 호출하면 buffer의 내용이 파일에 쓰여진다. 
			
			//object.dat을 읽어오기
			in = new ObjectInputStream(new FileInputStream("object.dat"));
			Date d = (Date) in.readObject(); //.dat 안에 있는 파일 읽고 Date로 형변환
			System.out.println(d); //Fri Dec 11 09:52:26 KST 2020 출력
			
		}
		catch (ClassNotFoundException e) //'클래스 못찾았다!' 에러. 위에서 IOException과 같이 쓸 수 있고 여기다 따로 써도 되고
		{
			e.printStackTrace();
		}
		finally 
		{
			if (in != null) 
			{
				in.close(); //close 함수가 내부적으로 flush함수를 호출
				}
			if (out != null) 
			{
				out.close();
			}
		}
	}

}
