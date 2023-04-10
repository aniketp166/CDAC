import java.util.Scanner;  
class Test7 

/*** a number as input and prints its multiplication table upto 10. 

8 x 1 = 8 
8 x 2 = 16 
8 x 3 = 24 
... 
8 x 10 = 80 ***/

{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
			
			{
				System.out.println(num+" * "+i+" = "+num*i);
			}
	}
	
}