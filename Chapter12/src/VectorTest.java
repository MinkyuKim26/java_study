//벡터 : 컬렉션의 일종. 가변 크기의 배열(dynamic array)
//컬렉션이니까 어떤 타입의 객체라도 저장 가능
import java.util.Vector;
import java.util.*;

public class VectorTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vc = new Vector();
		
		vc.add("Hello World!"); // Vector에 요소를 추가
		vc.add(new Integer(10)); // 다양한 타입의 객체 추가 가능
		vc.add(20);
		
		System.out.println("vector size : " + vc.size());//벡터 크기
		
		for (int i = 0; i < vc.size(); i++) {
			System.out.println("vector element " + i + " :" + vc.get(i));//뭐가 들어있는지 보여줌
		}
		
		//제네릭 기능을 사용하는 벡터
		Vector<String> vec = new Vector<String>();
		
		vec.add("Apple"); 
		vec.add("Orange"); 
		vec.add("Mango");
		//vec.add(1);//문자열을 저장하려고 선언한 객체라 딴거 저장하면 에러가 뜬다.
		System.out.println("벡터의 크기: " + vec.size());
		Collections.sort(vec);//벡터에 저장된 문자열을 정렬(정렬 기준은 오름차순. A~Z순서)
		for(String s: vec)
			System.out.print(s + " ");

	}

}
