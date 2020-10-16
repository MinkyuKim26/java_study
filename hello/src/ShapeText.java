class Shape_1 
{
		protected int x, y;
		public void draw() { System.out.println("Shape Draw"); }
}
class Rectangle_1 extends Shape_1 
{
		private int width, height;
		public void draw() { System.out.println("Rectangle Draw"); }
		//public void make() { System.out.println("Rectangle make"); } //새로 만든 자식 클래스 함수. 기존 함수 재정의 X
}
class Triangle_1 extends Shape_1 
{
		private int base, height;
		public void draw() { System.out.println("Triangle Draw"); }
}
class Circle_1 extends Shape_1 
{
	private int radius; 
	public void draw() { System.out.println("Circle Draw"); }
}


public class ShapeText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape_1 s1, s2;
		s1 = new Shape_1();
		s2 = new Rectangle_1(); //Rectangle_1 객체를 생성 후 s2가 가리키게 함.
		
		s1.draw();// Shape Draw 출력
		s2.draw();// Rectangle Draw 출력
		//s2.make();// make() is undefined for the type Shape_1 발생.
		
		//부모 클래스 변수가 자식 클래스 객체를 가리키게 한 다음 자식 클래스의 함수를 호출할 수 있다. 
		//부모 클래스에서 '정의 되었던' 자식 클래스의 함수만 부모 클래스 객체에서 호출 가능.
		//(부모 클래스를 통해서는 자식 클래스의 새로 생성된 요소에 접근 불가능, 기존에 있었던(자기가 갖고 있었던) 요소만 접근 가능.
	
		Shape_1[] arrayOfShapes = new Shape_1[3];
		arrayOfShapes[0] = new Rectangle_1(); 
		arrayOfShapes[1] = new Triangle_1(); 
		arrayOfShapes[2] = new Circle_1();
		
		for (int i = 0; i < arrayOfShapes.length; i++) 
		{ 
			arrayOfShapes[i].draw();
			
			//참조 변수가 가리키는 객체의 실제 타입을 알고 싶으면 instanceof 연산자 사용
			if(arrayOfShapes[i] instanceof Rectangle_1)
			{
				System.out.println("실제 객체는 Rectangle1이군요!");
			}
			if(arrayOfShapes[i] instanceof Triangle_1)
			{
				System.out.println("실제 객체는 Triangle_1이군요!");
			}
			if(arrayOfShapes[i] instanceof Circle_1)
			{
				System.out.println("실제 객체는 Circle_1이군요!");
			}
			
		}
		//참조 변수가 가리키는 실제 객체에 따라 메소드가 자동적으로 선택.
		//어떤 자식 객체건 부모 클래스의 참조 변수를 통하여 draw()를 호출하면 해당 자식 클래스 draw()가 자동으로 선택됨.
		//이를 동적 바인딩 또는 가상 메소드 호출이라고 한다. 
		
	}

}
