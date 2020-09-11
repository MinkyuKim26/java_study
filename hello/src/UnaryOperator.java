
public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 1;
		
		int nextx = ++x;
		int nexty = y++;
		
		System.out.println(nextx);//2
		System.out.println(nexty);//1
		System.out.println(y);//2(사용 후 증가. nexty를 정의한 뒤 y가 증가되었음.
		
		
	}

}
