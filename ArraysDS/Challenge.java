import java.util.*;

public class Challenge {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		int[] myIntegers = getIntegers(5);
	}
	public static int[] getIntegers(int numbers){
		int[] values = new int[numbers];
		System.out.println("Enter " + numbers + " integer values.\r");
		//Loop through numbers and return int
		for(int i = 0; i < values.length; i++){
			values[i] = scanner.nextInt();
		}
		return values;
	}

	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println("Element " + i + ", value is " + array[i]);
		}
	}

	public static int[] sortArray(int[] array){
		int[] sortedArray = new int[array.length];
		for(int i = 0; i < array.length; i++){
			sortedArray[i] = array[i];
		}
		boolean flag = true;
		int temp;
		while(flag){
			flag = false;
			for(int i = 0; i < sortedArray.length - 1; i++){
				if(sortedArray[i] < sortedArray[i + i]){
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}
		}
	}
}