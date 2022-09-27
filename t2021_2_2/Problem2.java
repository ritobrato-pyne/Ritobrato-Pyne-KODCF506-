package t2021_2_2;

import java.util.Scanner;

public class Problem2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a Number");
     int a=sc.nextInt();
     
     for(int i=1; i<=(a+(a-1)); i++)
     {
    	 if(i%2==0)
    	 {
    		 continue;
    	 }
    	 
    	 System.out.print(i+","+" ");
     }
	}

}
