import java.io.*;

public class LowerToUpper {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new FileReader("in.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
		
		int ch;
		while ((ch = in.read()) != -1)//read : 한 바이트씩 읽기
		{
			if (Character.isLowerCase(ch))//is~ : boolean 반환
			{
				ch=Character.toUpperCase(ch);//to~ : 변환
			}
			out.write(ch);
		}
		in.close();
		out.close();
	}

}
