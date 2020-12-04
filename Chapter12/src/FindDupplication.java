import java.util.*;
public class FindDupplication {
	//전체 문장에서 중복된 단어를 검출
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s = new HashSet<String>();
	
		String[] sample = { "사과", "사과", "바나나", "토마토" };
		
		for (String a : sample)
			if (!s.add(a))//추가할 때 false 반환 = 중복된 것.
				System.out.println("중복된 단어: " + a);
		System.out.println(s.size() + " 중복되지 않은 단어: " + s);
	}

}
