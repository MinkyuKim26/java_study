class Pizza_class_copy
{
	int radius;
	Pizza_class_copy(int r)
	{
		radius = r;
	}
	Pizza_class_copy whosLargest(Pizza_class_copy p1, Pizza_class_copy p2)
	{
		if(p1.radius > p2.radius)
			return p1;
		else
			return p2;
	}
}


public class PizzaTest_class_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza_class_copy obj1 = new Pizza_class_copy(14);
		Pizza_class_copy obj2 = new Pizza_class_copy(18);
		
		Pizza_class_copy largest = obj1.whosLargest(obj1,  obj2);
		System.out.println(largest.radius + "인치 피자가 더 큼.");
		
		obj2.radius +=1;
		
		System.out.println(largest.radius); //객체 주소를 주기 때문에 obj2가 가리키는 객체와 largest가 가리키는 주소 객체가 같음.
		System.out.println(obj2.radius); //그래서 obj2의 radius값을 키우면 largest의 radius값도 증가한다. '가리키는'이란 것을 유의. 
		//= 연산자는 객체를 복사하는 것이 아니라 객체를 가리키는 주소를 복사하는 것이다.
	}

}
