
public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {10, 20, 30, 40, 50}; //초기화와 동시에 값 할당
		
		for(int i = 0; i< scores.length; i++)//배열 객체 속 length라는 field(변수) 저
		{
			System.out.print(scores[i] + " ");
		}
	}

}
