public class SumOddRange {
	public static void main(String[] args){

		sumOdd(1, 100);
	}

	public static boolean isOdd(int n){
		if(n < 0){
			return false;
		}

		if(n % 2 != 0){
			return true;
		}else {
			return false;
		}
	}

	public static int sumOdd(int a, int b){
		if ( (b < a) || (a < 0) || (b < 0) ){
            return -1;
        }

		int sum = 0;
		for(int i = a; i <= b; i++){
			if(isOdd(i)){
				sum += i;
			}
		}
		return sum;
	}
}