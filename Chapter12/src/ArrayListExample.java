import java.util.*;

//ArrayList : 가변 크기의 배열을 구현하는 클래스.
//Vector보다 성능이 우수하지만 멀티 스레드 상황이라면 동기화를 지원하는 Vector를 사용하는 것이 좋다. 
//제네릭 클래스로 재공되기에 생성하려면 타입 매개 변수를 저장해야한다. 

//2차원 공간의 한 점을 나타내는 클래스
class Point 
{
	int x, y;
	public Point(int x, int y) 
	{
		this.x = x; this.y = y;
	}
	public String toString() { return "(" + x + ", " + y + ")"; }
}

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(); //String타입
		//순서대로 추가
		list.add( "MILK" );
		list.add( "BREAD" );
		list.add( "BUTTER" );
		
		//특정 위치에 추가, 삭제
		list.add( 1, "APPLE" );// 인덱스 1에 "APPLE"을 삽입
		list.set( 2, "GRAPE" );// 인덱스 2의 원소를 "GRAPE"로 대체 
		list.remove( 3 );// 인덱스 3의 원소를 삭제
		String s = list.get(1);// 인덱스 1의 원소를 반환
		int i = list.size();// 현재 저장된 원소의 개수 반환
		
		ArrayList<Point> point_list = new ArrayList<Point>();//Point 타입 
		point_list.add(new Point(0, 0)); 
		point_list.add(new Point(4, 0)); 
		point_list.add(new Point(3, 5));
		point_list.add(new Point(-1, 3));
		point_list.add(new Point(12, 2));
		
		System.out.println(list);
		System.out.println(point_list);
	}

}
