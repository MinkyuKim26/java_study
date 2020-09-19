
public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 100, 110, 120}
		};
		
		for(int r = 0; r<array.length; r++)// 길이(3)
		{
			for(int c = 0; c< array[r].length; c++)// 길이(4)
			{
				System.out.println(r + "행" + c + "열:" + array[r][c]);
			}
		}
	}

}
