package Chaper5_prob;
import java.util.Scanner;

class Grade
{
	private int[] Grades;
	private int sum_score = 0;
	private double avg_score = 0;
	public Grade(int std_num)
	{
		Grades = new int[5];
	}
	public void cal_score()
	{
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0; i< Grades.length; i++)
		{
			System.out.print("성적을 입력하시오:");
			Grades[i] = input.nextInt();
		}
		for(int i = 0; i< Grades.length; i++)
		{
			sum_score +=Grades[i];
		}
		avg_score = sum_score / Grades.length;
	}
	public double get_avg_score()
	{
		return avg_score;
	}
	public int get_sum_score()
	{
		return sum_score;
	}
}

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("학생수를 입력하시오 : ");
		int std_num = input.nextInt();
		Grade grd = new Grade(std_num);
		grd.cal_score();
		int sum_score = grd.get_sum_score();
		double avg_score = grd.get_avg_score();
		
		System.out.println("합계 : " + sum_score);
		System.out.println("평균 : " + avg_score);
		
	}

}
