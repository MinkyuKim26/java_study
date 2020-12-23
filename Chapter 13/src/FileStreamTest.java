//파일 입출력 바이트 스트림
//모든 바이트 스트림은 InputStream과 OutputStream 클래스에서 파생됨.
//파일에서 바이트를 읽고 쓰기 위해 FileInputStream(읽기)과 FileOutputStream(쓰기) 클래스를 사용.

//이진파일 쓰기(저장)
import java.io.*;

public class FileStreamTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		byte list[] = {10, 20, 30, 40, 50, 60};
		
		try( FileOutputStream out = new FileOutputStream("test.bin") ) 
		{
			for(byte b:list)//list에 있는 값을 처음부터 끝까지 읽는동안 반복
			{
				out.write(b);//변수에서 읽은거 파일에다 쓰기
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();//메소드가 내부적으로 예외 결과를 화면에 출력. 가장 자세한 예외 정보 제공
		}
	}

}
