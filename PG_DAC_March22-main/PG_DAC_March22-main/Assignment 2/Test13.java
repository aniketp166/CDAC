import java.util.Scanner;
class Test13 
//to print the area and perimeter of a rectangle.

{
   public static void main(String args[]) 
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter width of rectangle");
	double width= sc.nextDouble();
	
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter height of rectangle");
	double height= in.nextDouble();

        double perimeter = 2*(height + width);
		
        double area = width * height;			
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }
}