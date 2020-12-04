//컬렉션 : 자료 구조(리스트, 스택, 큐, 집합, 해쉬 테이블 등)
//사이즈에 제한이 없다. -> 계속 변한다.
//제네릭 기법으로 구현되어있어 어떠한 자료형도 저장 가능
//객체만 저장 가능. int같은 기본 자료형은 저장 불가능. 
//허나 Integer나 Double같이 기본 자료형을 감싼 Wrapper클래스는 저장 가능
//기본 자료형을 저장하면 auto boxing에 의해 자동으로 랩퍼 클래스의 객체로 변환

//컬렉션 - 인터페이스와 클래스로 나뉨
//모두 java.util에 포함
//Collection : 모든 자료구조의 부모 인터페이스. 객체의 모임을 나타냄
//Set : 집합을 나타내는 자료구조. 집합은 중복된 원소를 가지지 않는다. 
//List : 순서가 있는 자료구조. 중복된 원소를 가질 수 있다. 
//Map : 키와 값들이 연결되어 있는 자료구조. 사전과 같다. 파이썬의 딕셔너리같은 것이라 생각하면 된다.
//Queue : 들어온 순서대로 나가는 자료구조. 극장의 대기줄 생각하기

import java.util.*;
import java.util.Set;

public class Collection_Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//세트
		Set<String> alphabet_set = new HashSet<String>();
		for(int i = 0; i< 10; i++)
		{
			alphabet_set.add("test");//test만 집어넣음 -> 중복되기 때문에 하나만 저장됨
		}
		System.out.println(alphabet_set.size());//하나만 저장되어 size = 1
		
		//리스트
		ArrayList pitches = new ArrayList();//투수 공 속도 저장한 리스트
		//값 저장
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		//특정 위치에 값 저장
		pitches.add(0, "133");// 첫번째 위치에 133 삽입.
		pitches.add(1, "133");//두번째 위치에 133 삽입.
		//값 얻기
		System.out.println(pitches.get(1));
		//크기 확인
		System.out.println(pitches.size());
		//해당 값이 있는지 조사
		System.out.println(pitches.contains("142"));
		//값 제거
		System.out.println(pitches.remove("129")); //삭제 결과 리턴(true, false)
		
		//맵
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		//값 얻기
		System.out.println(map.get("people"));
		//해당 키가 있는지 조사
		System.out.println(map.containsKey("people"));
		//크기 확인
		System.out.println(map.size());
		
		//큐
		Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언, linkedlist 이용
		queue.add(1);     // queue에 값 1 추가. add : 추가를 성공하면 true 반환
		queue.add(2);     // queue에 값 2 추가
		queue.offer(3);   // queue에 값 3 추가
		
		//값 얻기
		queue.peek();       // queue의 첫번째 값 참조
		System.out.println(queue.peek());//queue.peek() 사용 예제. 1이 나옴. 
		
		//값 제거 : poll이나 remove사용.poll()는 제거 성공할 null반환
		queue.poll();       // queue에 첫번째 값을 반환하고 제거. 비어있다면 null
		queue.remove();     // queue에 첫번째 값 제거
		queue.clear();      // queue 초기화
		
		
		
	}

}
