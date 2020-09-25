
public class Pizza {

	int size;
	String type;
	
	//생성자 오버라이딩
	public Pizza()
	{
		size=12;
		type = "슈퍼스프림";
	}
	public Pizza(int s, String t)
	{
		size = s;
		type = t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza obj1 = new Pizza();
		System.out.println("(" + obj1.type + "," + obj1.size+")");
		
		Pizza obj2 = new Pizza(24, "포테이토");
		System.out.println("(" + obj2.type + "," + obj2.size+")");
	}

}
