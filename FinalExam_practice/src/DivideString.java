import java.util.*;
import java.util.Scanner;

public class DivideString 
{	
	public static void main(String[] args) 
	{
		String str;
		String[] word_ary; 
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("문자열을 입력하시오 : ");
		str = input.nextLine(); //문자열(한 줄)받을 때는 nextLine
		word_ary = str.split(" ");
		
		for(String word : word_ary)
		{
			System.out.print(word+", ");
		}
		System.out.println("모두 " + word_ary.length + "개의 단어가 있습니다.");
	}

}
