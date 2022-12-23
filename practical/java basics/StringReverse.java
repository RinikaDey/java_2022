/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse: ");
		String str = sc.nextLine();
		String[] a = str.split(" ");
		for(int i=a.length-1; i>=0; i--){
		    System.out.print(a[i]);
		    if(i!=0){
		        System.out.print(" ");
		    }
		}
		
	}
}