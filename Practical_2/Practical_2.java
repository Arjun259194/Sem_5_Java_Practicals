/**
 * Practical_2
 */
public class Practical_2 {
	static void printPrimeNumber(int n){
		for (int i = 2; i <= n; i++){
			boolean check = true;
			for ( int j = 2; j < i; j++){
				if (i % j == 0){
					check = false;
					break;
				}
			}
			 if ( check == true){
				 System.out.print(i + " ");
			 }
		}
	}
  	public static void main(String[] args) {
		// Printing n prime number
			printPrimeNumber(50);
  	}
}
