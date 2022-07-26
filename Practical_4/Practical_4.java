/**
 * Practical_4
 */

import java.util.Scanner;

public class Practical_4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number, size, firstBigNumber = 0, secondBigNumber = 0;
    
    System.out.println("enter size of number:");
    size = sc.nextInt();

    while(size > 0) {
      System.out.println("Enter a number:");
      number = sc.nextInt();
      if (number > firstBigNumber) {
        secondBigNumber = firstBigNumber;
        firstBigNumber = number;
      }
      size--;
    }

    System.out.println("second biggest number is " + secondBigNumber);
  }

}