//Map : 파이썬의 딕셔너리와 같다. 
//HashMap, TreeMap, LinkedHashMap이 제공됨
//HashMap : 해쉬 테이블에 데이터를 저장
//TreeMap : 탐색 트리에 데이터 저장
//키들을 정렬된 순서로 방문할 필요가 없다면 HashSet이 약간 빠르다.
import java.util.*;

class Student 
{
	int number;
	String name;
	public Student(int number, String name) 
	{ 
		this.number = number;
		this.name = name;
	}
	public String toString() 
	{ 
		return name;
	} 
}

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student> st = new HashMap<String, Student>(); 
		//데이터 저장(add)
		st.put("100", new Student(100, "홍길동"));
		st.put("200", new Student(200, "김유신"));
		st.put("300", new Student(300, "김철수"));
		System.out.println(st); // 모든 항목을 출력 
		st.remove("200"); // 하나의 항목을 삭제 
		st.put("100", new Student(20090003, "최자영"));// 하나의 항목을 대치 (김유신을 최자영으로). 
		//이 때 키는 저장되지 않고 값만 저장되는듯. 왜냐하면 키가 100인 곳에 저장하는 거니까.
		System.out.println(st.get("300")); // 값을 참조
		
		for (Map.Entry<String, Student> s : st.entrySet())  // 모든 항목을 방문
		{  // Map에 저장된 데이터를 방문할 때는 Map.Entry 인터페이스를 사용한다.
			String key = s.getKey();
			Student value = s.getValue(); 
			System.out.println("key=" + key + ", value=" + value);
		}
	}

}
