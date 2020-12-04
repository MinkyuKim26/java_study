//섞기(Shuffle) : 정렬의 반대 동작.
//리스트에 존재하는 정렬을 파괴하여 원소들의 순서를 랜덤하게 만든다.

import java.util.*;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(); 
		for (int i = 1; i <= 10; i++)
			list.add(i); Collections.shuffle(list);//셔플할 때마다 결과가 다르다.
		System.out.println(list);
	}

}
