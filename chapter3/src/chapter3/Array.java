package chapter3;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] Ary = {1.0, 2.0, 3.0, 4.0};
		int sum = 0;
		double ary_maxVal = 0;
		
		for(int i = 0; i< Ary.length; i++)
		{
			System.out.print(Ary[i] + " ");
			sum += Ary[i];
			if(i == 0) ary_maxVal = Ary[i];
			else
			{
				if(ary_maxVal < Ary[i])
					ary_maxVal = Ary[i];
			}
		}
		System.out.println("\n합은 " + sum);
		System.out.println("최대값은 " +ary_maxVal);
		
		
	}

}
