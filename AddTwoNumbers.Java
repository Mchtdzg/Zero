//Georgiy Machitidze 3120
import java.util.Scanner;

public class AddTwoNumbers
{
	public static void main(String[] args) 
	{
		scan_and_add();
	}

	//function receives 2 user inputs
	//if they are numeric entries adds and prints them
	public static void scan_and_add()
		{
			Scanner scan = new Scanner(System.in);
			boolean int1, int2; 	//if both entries are true, printed sum is int
			boolean double1, double2; 
			int int_a = 0, int_b = 0, int_c = 0;
			double double_a = 0, double_b = 0, double_c = 0;
			
			System.out.println("Enter first number to add...");
			if(scan.hasNextInt())
			{
				int1= true;
				double1 = false;
				int_a = scan.nextInt();
			}
				else
					if(scan.hasNextDouble())
					{
						double1 = true;
						int1 = false;
						double_a = scan.nextDouble();
					}
						else
						{
							int1 = false;
							double1 = false;
						}
			System.out.println("Enter second number to add...  " );
			if(scan.hasNextInt())
			{
				int2= true;
				double2 = false;
				int_b = scan.nextInt();
			}
				else
				{
					if(scan.hasNextDouble())
					{
						double2 = true;
						int2 = false;
						double_b = scan.nextDouble();
					}
						else
						{
							int2 = false;
							double2 = false;
						}
				}
			//if 2 ints were entered prints sum
			if(int1 && int2)
			{
				int_c = int_a + int_b;
				System.out.println("the sum is: "+int_c);
			}
			else
			{
				//if an int and a double was entered, or two doules, prints double sum
				if(int1 && double2 || double1 && int2 || double1 && double2)
				{
					double_c = int_a + int_b + double_a + double_b;
					System.out.println("the sum is: " + double_c);
				}
				//if any entry contains a non int or double prints error and restarts method
				else
				{
					System.out.println("You entry was invalid, please enter 2 numbers");
					scan_and_add();
				}
				
			}
		}
}
