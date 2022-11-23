/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num = 152;
		int sum = 0;
		int temp = num;
		while(temp>0) {
		    int rem = temp%10;
		    temp = temp/10;
		    sum += Math.pow(rem,3);
		}
		if(sum == num) {
		    System.out.println("Armstrong number!");
		}
		else {
		    System.out.println("Not armstrong number!");
		}
	}
}
