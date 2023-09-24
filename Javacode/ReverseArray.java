package Javacode;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int m,n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array A :");
		m=sc.nextInt();
		System.out.println("Enter the size of array B : ");
		n=sc.nextInt();
		int[]a=new int[m];
		int[]b=new int[n];
		j=n-1;
		System.out.println("enter the elements:");
		for(i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
			b[j]=a[i];
			j--;
			//System.out.print(b[j]);
		}
		for(j=0;j<=n-1;j++) {
			System.out.print(b[j]);
		}
}
}
