import java.util.Scanner;
class Test15
// to swap two variables.
 {
 
 public static void main(String args[]) 
 {    
		Scanner in = new Scanner(System.in);

		System.out.print("Input first number: ");
		int num1 = in.nextInt();
	
		System.out.print("Input second number: ");
		int num2 = in.nextInt();


  int temp;
   System.out.println("Before swapping : a, b = "+num1+", "+ + num2);
   temp = num1;
   num1 = num2;
   num2 = temp;   
  System.out.println("After swapping : a, b = "+num1+", "+ + num2);
 }
 }