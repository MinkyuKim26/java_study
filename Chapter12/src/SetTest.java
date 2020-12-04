//Set(집합) : 데이터의 중복을 막는다.(동일한 데이터를 중복해서 가질 수 없다)
//순서가 없다. 
//Set에 대해 3가지 구현 클래스 제공
//HashSet : 해쉬 테이블에 원소를 저장.(해쉬 함수를 이용해 원소 저장) 성능면에서 가장 우수. 원소들의 순서가 일정하지 않다는 단점이 있다.
//TreeSet : 레드-블랙 트리(red-black tree, 자가 균형 2진 탐색 트리)에 원소를 저장. 값에 따라 순서가 결정되지만 HashSet보다 느리다.
//LinkedHashSet : Linked List + Hash set. 원소들의 순서는 삽입된 순서와 같다.

import java.util.*;
public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet
		HashSet<String> hash_set = new HashSet<String>(); 
		hash_set.add("Milk");
		hash_set.add("Bread");
		hash_set.add("Butter");
		hash_set.add("Cheese");
		hash_set.add("Ham");
		hash_set.add("Ham");//중복 되기에 저장X
		
		System.out.println(hash_set); //순서 없이 출력. 그럼 출력되는 기준은?
		if (hash_set.contains("Ham")) {
			System.out.println("Ham도 포함되어 있음");
		}
		
		//LinkedSet
		LinkedHashSet<String> linked_set = new LinkedHashSet<String>(); 
		linked_set.add("Milk");
		linked_set.add("Bread");
		linked_set.add("Butter");
		linked_set.add("Cheese");
		linked_set.add("Ham");
		linked_set.add("Ham");
		
		System.out.println(linked_set); //입력된 순서대로 출력
		if (linked_set.contains("Ham")) {
			System.out.println("Ham도 포함되어 있음");
		}
		
		//TreeSet
		TreeSet<String> tree_set = new TreeSet<String>(); 
		tree_set.add("Milk");
		tree_set.add("Bread");
		tree_set.add("Butter");
		tree_set.add("Cheese");
		tree_set.add("Ham");
		tree_set.add("Ham");
		
		System.out.println(tree_set); //크기 순으로 저장. 이 경우에는 알파벳 순서(알파벳마다 순서가 있으니.)
		
		if (tree_set.contains("Ham")) {
			System.out.println("Ham도 포함되어 있음");
		}
	}

}
