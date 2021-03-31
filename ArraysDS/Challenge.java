import java.util.*;

public class Challenge {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		
	}
	public static int[] getIntegers(int numbers){
		System.out.println("Enter " + numbers + " integer values.\r");
		int[] values = new int[numbers];
		//Loop through numbers and return int
		for(int i = 0; i < values.length; i++){
			values[i] = scanner.nextInt();
		}
		return values;
	}

	public static void printArray(){

	}

	public static int[] sortArray(){
		
	}
}