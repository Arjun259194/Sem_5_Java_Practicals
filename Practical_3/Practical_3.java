/**
 * Practical_3
 */
public class Practical_3 {

	// Function to Print biggerst number among three numbers
	static int maxInThree(int v1,int v2,int v3){
		int maxValue = v1;
		if (v2 > v1 && v2 > v3){
			maxValue = v2;
		}
		else if (v3 > v1){
			maxValue = v3;
		}

		return maxValue;
	}

	public static void main(String[] args){
		int bigNumber;

		bigNumber = maxInThree(20,22,40);

		System.out.println("big number is " + bigNumber);
	}
}
