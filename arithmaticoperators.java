package arithmatic;
import java.util.Scanner;
public class arithmaticoperators
{
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your choice");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	int choice =sc.nextInt();
	int  m,n,result;
	switch(choice)
	{
	case 1: System.out.println("Enter any two numbers to Addition");
	        m =sc.nextInt();
	        n =sc.nextInt();
	        result=m+n;
	        System.out.println("Addition of "+m+" and "+n+" is: "+result);
            break;
	case 2: System.out.println("Enter any two numbers to Subtraction");
            m =sc.nextInt();
            n =sc.nextInt();
            result=m-n;
            System.out.println("Subtraction of "+m+" and "+n+" is: "+result);
            break;        
	case 3: System.out.println("Enter any two numbers to Multiplication");
            m =sc.nextInt();
            n =sc.nextInt();
            result=m*n;
            System.out.println("Multiplication of "+m+" and "+n+" is: "+result);
            break;
	case 4: System.out.println("Enter any two numbers to Division");
            m =sc.nextInt();
            n =sc.nextInt();
            result=m/n;
            System.out.println("Addition of "+m+" and "+n+" is: "+result);
            break;
   default: System.out.println("you have entered wrong choice");
              break;
	}
  }
}