package chapter07;

import java.util.Arrays;

public class ArraysText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9,4,5,6,2,1};
		Arrays.sort(array);//소팅
		printArray(array);
		System.out.println(Arrays.binarySearch(array, 9));//array에서 9의 위치를 찾아서 출력
		Arrays.fill(array, 8); //배열의 모든 값을 8로 채움
		printArray(array);
	}
	private static void printArray(int[] array)
	{
		System.out.print("[");
		for(int i = 0; i< array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println("]");
	}

}
