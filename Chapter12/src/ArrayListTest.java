//indexOf()로 특정 문자열을 찾는 예제
//indexOf() : ArrayList안에 저장된 데이터를 찾아서 인덱스를 반환하는 메소드
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Pear"); list.add("Grape");
		
		int index = list.indexOf("Mango"); 
		System.out.println("Mango의 위치: " + index);//Mango의 위치 반환. 세번 째로 저장되었기에 2 반환(0부터 시작)
	}

}
