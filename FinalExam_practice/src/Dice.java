
import java.util.*;

public class Dice {

	private int Dice_num;
	public Dice()
	{
		Dice_num=1;
	}
	public int roll() 
	{
		Random r = new Random();
		Dice_num = r.nextInt(6) + 1; //r.nextInt(6) : 0~5
		return Dice_num;
		
	}
	public void setValue(int v)
	{
		Dice_num = v;
	}
	public int getValue()
	{
		return Dice_num;
	}
	public String toString()
	{
		return "현재 주사위 상태 : " + Dice_num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice d = new Dice();
		d.roll();
		System.out.println(d.toString());
	}

}
