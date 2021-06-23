public class Challenge2 {
	public static void main(String[] args){

		int sum = 0;
		int counter = 0;
		for(int i = 1; i <= 1000; i++){
			if(i % 3 == 0 && i % 5 == 0){
				sum += i;
				counter++;
				if(counter == 5){
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
		System.out.println("Sum of all divisible by 3 and 5 are " + sum);
	}
}