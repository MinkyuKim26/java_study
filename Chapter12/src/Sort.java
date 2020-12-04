//Collection 클래스 : 여러 유용한 알고리즘을 구현한 메소드 제공
//제네릭 기술을 사용하여 작성되었고 정적 메소드의 형태로 되어있다. 
//주요 알고리즘 : 정렬(Sorting), 섞기(Shuffling), 탐색(Searching)

//정렬 : 데이터를 어떤 기준에 의하여 순서대로 나열하는 것
//퀵 정렬, 합병 정렬, 히프 정렬 등이 있다. 
//Collection 클래스의 정렬은 속도가 비교적 빠르고 안정성이 보장된 합병 정렬을 이용한다. 
//안정성 : 동일한 값을 가지는 원소를 다시 정렬하지 않는 것
//합병 정렬은 시간 복잡도가 O(nlog(n))이며 거의 정렬된 리스트에 대해서 상당히 빠르다.(n은 원소 개수)
import java.util.*;

class Student_sort implements Comparable<Student_sort> 
{ 
	int number;
	String name;
	public Student_sort(int number, String name) 
	{ 
		this.number = number;
		this.name = name;
	}
	public String toString() 
	{ 
		return name;
	}
	public int compareTo(Student_sort s) 
	{ 
		return number - s.number;
	} 
}

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sample = { "i", "walk", "the", "line" }; 
		List<String> list = Arrays.asList(sample); //배열을 리스트로 변경
		
		Collections.sort(list); //sort() : 인터페이스를 구현하는 컬렉션에 대해 정렬을 수행. 
		//비교 가능한 인터페이스를 구현한 클래스에 대해서 수행
		//String : 알파벳 순서. Date : 시간적 순서 <- String, Date 모두 비교 가능한 인터페이스를 구현
		System.out.println(list); //알파벳 순서대로 정렬
		
		//사용자 객체 정렬 
		//사용자가 만든 객체는 비교 가능한 인터페이스가 구현되지 않았을 것(따로 추가하지 않았다면)
		//비교 가능한 인터페이스는 compareTo 메소드를 갖고 있다. 
		//compareTo : 현재 객체를 매개 변수 객체와 비교 후 작으면 음수, 같으면 0, 크면 양수를 반환.
		//사용 예 : 학생을 나타내는 클래스(위에 있는 Student)에 학번(숫자)을 비교하는 compareTo()를 구현하여 정렬.
		Student_sort st_array[] = 
			{
				new Student_sort(2, "김철수"),
				new Student_sort(3, "이철수"), 
				new Student_sort(1, "박철수"),
			};
		List<Student_sort> st_list = Arrays.asList(st_array);//객체 배열을 리스트로 바꾼 뒤 저장
		Collections.sort(st_list); //소팅
		System.out.println(st_list);//학번 순으로 정렬된 것이 출력된다. 
		
	}

}
