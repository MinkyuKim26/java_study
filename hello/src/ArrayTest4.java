
public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 20, 30};//초기화와 동시에 할당
		
		for(int value : numbers)//value에 number의 첫번째 원소부터 차례대로 대입. 다 대입되었으면 for문 탈출
		{
			System.out.print(value + " ");
		}
	}

}
