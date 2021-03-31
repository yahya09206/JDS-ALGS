import java.util.*;
public class Challenge2 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter count: ");
		int count = scanner.nextInt();
		scanner.nextLine();
		int[] returnedArray = readIntegers(count);
		int returnedMin = findMin(returnedArray);
		System.out.println("min = " + returnedMin);

	}
	public static int[] readIntegers(int count){
		int[] values = new int[count];
		for(int i = 0; i < values.length; i++){
			System.out.println("Enter a number: ");
			int number = scanner.nextInt();
			scanner.nextLine();
			values[i] = number;
		}
		return values;
	}

	private static int findMin(int[] array){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++){
			int value = array[i];
			if(value < min) {
				min = value;
			}
		}
		return min;
	}

}