/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,firstNum=0,secondNum=1,sum=0,tempSum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print fibonacci series: ");
		num = sc.nextInt();
		System.out.println("The fibonacci series: \n");
		System.out.println(firstNum);
		System.out.println(secondNum);
		while(num>tempSum){
		    sum = firstNum+secondNum;
		    firstNum= secondNum;
		    secondNum= sum;
		    System.out.println(sum);
		    tempSum = sum+firstNum;
		}
		
	}
}
