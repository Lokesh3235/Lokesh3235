package Javacode;

import java.util.Scanner;

public class LarNum {
public static void main(String[]args) {
	int i,n;
	System.out.println("Enter the size of array A:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int []a=new int[n];
	System.out.println("Enter the Elements to array:");
	for(i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	int max=a[0];
	for(i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
	}
}
System.out.println("The Largest number is : "+ max);
}
}
