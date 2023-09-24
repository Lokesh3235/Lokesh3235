package Javacode;
import java.util.*;
public class LargeNum {
	public static void main(String[]args) {
		int n,i;
		System.out.println("Enter the size of array:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int []a=new int[n];
		System.out.println("enter the elements:");
		for(i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		int x,count=0;
		System.out.println("Enter the Search Element:");
		x=sc.nextInt();
		for(i=0;i<=a.length-1;i++) {
			if(x==a[i]) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("enter element not found");
		}
		else {
			System.out.println("Enter Element found");
			System.out.println("count="+ count);
		}
	}

}
