import java.util.*;
import java.util.Scanner;

public class DicTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		HashMap map = new HashMap();
		map.put("map", "지도");
		map.put("java", "자바");
		map.put("school", "학교");
		
		while(true)
		{
			System.out.print("영어 단어를 입력하세요:");
			String str = input.nextLine();
			
			if(str.equals("quit") == true)
			{
				System.out.println("이용해 주셔서 감사합니다.");
				break;
			}
			else
			{
				System.out.println("단어의 의미는 " + map.get(str));
			}
		}
		
		
	
	}

}
