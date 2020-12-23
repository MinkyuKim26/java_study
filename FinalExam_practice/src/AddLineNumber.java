import java.util.*;
import java.io.*;

public class AddLineNumber 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		//함수 이름이 떠오르지 않는다...
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		
		int counter = 0;
		while (true) 
		{
			counter++;
			String line = br.readLine();
			if (line == null)
				break;
			pw.println("" + counter + ":" + line);
			System.out.println("" + counter + ":" + line);
		}
		br.close();
		pw.close();
	}

}
