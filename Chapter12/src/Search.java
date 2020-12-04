//탐색 : 리스트 안에서 원하는 원소를 찾는 것
//Collection 클래스의 binarySearch알고리즘은 정렬된 리스트에서 저장된 원소를 이진탐색
//이진탐색 : 데이터가 정렬돼 있는 배열에서 특정한 값을 찾아내는 알고리즘. 
//임의의 값을 선택하여 찾고자 하는 값 X와 비교. 
//X가 중간 값보다 작으면 중간 값을 기준으로 좌측의 데이터들을 대상으로, 
//X가 중간값보다 크면 배열의 우측을 대상으로 다시 탐색(임의의 값 선택 -> 비교 -> 좌측or우측 선택)

import java.util.*;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key = 1000;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) list.add(i);
		
		int index = Collections.binarySearch(list, key);//리스트에 key가 있는 index를 반환. 
		//못찾으면 -101을 반환하는걸 보니  -1 * (size + 1)을 반환하는듯? 
		//size가 200인 경우를 보니 -201을 반환한다.
		System.out.println("탐색의 반환값 = " + index);
	}

}
