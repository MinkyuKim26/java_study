
public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0x0fff;
		int y = 0xfff0;
		
		System.out.printf( "%x", (x&y));//비트 AND
		System.out.printf( "%x", (x|y));//비트 OR
		System.out.printf( "%x", (x^y));//비트 XOR
		System.out.printf( "%x", ~x);//비트 NOT
	}

}
