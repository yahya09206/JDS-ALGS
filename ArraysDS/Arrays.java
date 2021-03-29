public class Arrays {
	public static void main(String[] args){
		//Declaring an Array
		int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// double[] myDoubleArray = new double[10];
		System.out.println(myIntArray[0]);
		System.out.println(myIntArray[6]);
		System.out.println(myIntArray[8]);

		//Init using for loop
		int[] myIntArray2 = new int[25];
		for(int i = 0; i < myIntArray2.length; i++){
			myIntArray2[i] = i * 10;
		}
		printArray(myIntArray2);
	}

	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++){
			System.out.println("Element " + i + ", value is " + array[i]);
		}
	}
}