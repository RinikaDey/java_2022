/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,temp=0,sum=0,rem=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check palindrome or not: ");
		num = sc.nextInt();
		temp = num;
		while(temp!=0){
		    rem = temp % 10;
		    sum = sum*10 + rem;
		    temp = temp/10;
		}
		if(sum == num){
		    System.out.println("palindrome");
		}
		else {
		    System.out.println("not palindrome");
		}
	}
}
