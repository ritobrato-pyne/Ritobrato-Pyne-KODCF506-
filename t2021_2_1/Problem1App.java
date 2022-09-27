package t2021_2_1;
import java.util.Scanner;
public class Problem1App 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      Problem1 c=new Problem1();
      System.out.println("Please Enter 'add' for Addition");
      System.out.println("Please Enter 'sub' for Subtraction");
      System.out.println("Please Enter 'mul' for Multiplication");
      System.out.println("Please Enter 'div' for Division");
      String str=sc.nextLine();
      switch(str)
      {
      case "add":
      {
    	  System.out.println("Enter two Numbers");
    	  double a=sc.nextDouble();
    	  double b=sc.nextDouble();
    	  double res=c.addition(a,b);
    	  System.out.println("The Addition of "+a+" & "+b+" is:- "+res);
    	  break;
      }
      case "sub":
      {
    	  System.out.println("Enter two Numbers");
    	  double a=sc.nextDouble();
    	  double b=sc.nextDouble();
    	  double res=c.substraction(a,b);
    	  System.out.println("The Subtraction of "+a+" & "+b+" is:- "+res);
    	  break;
      }
      case "mul":
      {
    	  System.out.println("Enter two Numbers");
    	  double a=sc.nextDouble();
    	  double b=sc.nextDouble();
    	  double res=c.multiplication(a,b);
    	  System.out.println("The Multiplication of "+a+" & "+b+" is:- "+res);
    	  break;
      }
      case "div":
      {
    	  System.out.println("Enter two Numbers");
    	  double a=sc.nextDouble();
    	  double b=sc.nextDouble();
    	  double res=c.division(a,b);
    	  System.out.println("The Division of "+a+" & "+b+" is:- "+res);
    	  break;
      } 
      }
	}

}
