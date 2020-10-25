package Chaper5_prob;
import java.util.Scanner;
class MyMetric
{
	public static void kiloToMile(double km)
	{
		double mile = km/1.6093;
		
		System.out.println(km + "km를 마일로 바꾸면 " + mile + "mile");
	}
}

public class MyMetricTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double km, mile;
		Scanner input = new Scanner(System.in);
		System.out.print("거리를 km로 입력하시오:");
		km = input.nextDouble();
		MyMetric.kiloToMile(km);
		
	}

}
