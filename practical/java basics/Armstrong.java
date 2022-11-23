/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,temp1=0,sum=0,temp2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check armstrong or not: ");
		num = sc.nextInt();
		temp1 = num;
		while(num!=0){
		    temp2 = num % 10;
		    sum = sum + temp2*temp2*temp2;
		    num = num/10;
		}
		if(sum == temp1){
		    System.out.println("armstrong");
		}
		else {
		    System.out.println("not armstrong");
		}
	}
}
