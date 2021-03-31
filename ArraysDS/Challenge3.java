import java.util.*;
public class Challenge3 {
	public static void main(String[] args){
		int[] newArray = {1, 5, 3, 7, 11, 9, 15};
		System.out.println("Array = " + Arrays.toString(newArray));
		reverse(newArray);
		System.out.println("Reversed Array = " + Arrays.toString(newArray));
	}
	private static void reverse(int[] array){
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		for(int i = 0; i < halfLength; i++){
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
	}
}