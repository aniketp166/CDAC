import java.util.Scanner;
class Test6

//  to print the sum (addition), multiply, subtract, divide and remainder of two numbers

{
	public static void main (String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number : ");

    int num1 = sc.nextInt();

	System.out.println("Enter second number : ");
	int num2 = sc.nextInt();
	
	int addition = num1+num2;
	int substract = num1-num2;
	int product = num1*num2;
	int divide = num1/num2;
	int mod = num1%num2;
	
	System.out.println("Addition of "+num1+ " and "+num2+" is : "+addition);
	System.out.println("Subtraction of "+num1+ " and "+num2+" is : "+substract);
	System.out.println("Multiplication of "+num1+ " and "+num2+" is : "+product);
	System.out.println("Division of "+num1+ " and "+num2+" is : "+divide);
	System.out.println(" of "+num1+ " and "+num2+" is : "+mod);


	}
}