package Chapter3_prob;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] num = {1.0, 2.0, 3.0, 4.0};
		double sum = 0, max = 0;
		
		for(int i = 0; i< num.length; i++)
		{
			System.out.print(num[i] + " ");
			sum += num[i];
			if(max < num[i]) max = num[i];
		}
		System.out.println("\n합은 "+sum);
		System.out.println("최대값은 "+max);
	}
}
