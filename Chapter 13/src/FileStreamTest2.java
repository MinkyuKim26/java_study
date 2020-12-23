//FileStreamTest에서 저장한 파일을 읽고 출력

import java.io.*;
public class FileStreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte list[] = new byte[6];
		
		try (FileInputStream in = new FileInputStream("test.bin")) 
		{
			in.read(list);//파일에서 읽은거 list(변수)에다 쓰기
		}
		catch (IOException e) //예외가 발생하면? (파일 못읽는거 등)
		{
			e.printStackTrace();//예외 상세히 알려주기.
		}
		//파일 다읽어서 저장한거 출력
		for (byte b : list)
			System.out.print(b + " ");
		System.out.println();
	}

}
