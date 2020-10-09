class Pizza_static_var
{
	private String toppings;
	static int count = 0;
	
	public Pizza_static_var(String toppings)
	{
		this.toppings = toppings;
		count++;
	}
}

public class PizzaTest_static_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza_static_var p1 = new Pizza_static_var("Super Supreme");
		Pizza_static_var p2 = new Pizza_static_var("Cheese");
		Pizza_static_var p3 = new Pizza_static_var("Pepperoni");
		int n = Pizza_static_var.count;
		System.out.println("지금까지 판매된 피자 개수 = " + n);
	}

}
