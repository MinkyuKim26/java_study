//합집합과 교집합

import java.util.*;

public class SetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> s1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 5)); 
		HashSet<Integer> s2 = new HashSet<Integer>(Arrays.asList(2, 4, 5, 8)); 
		s1.retainAll(s2);//교집합
		System.out.println(s1);
		
		Set<String> s3 = new HashSet<String>(Arrays.asList("a", "b", "c")); 
		Set<String> s4 = new HashSet<String>(Arrays.asList("b", "d"));
		s3.addAll(s4);//합집합
		System.out.println(s3);
	}

}
