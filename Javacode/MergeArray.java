package Javacode;
import java.util.Scanner;
public class MergeArray {

	public static void main(String[] args) {
		int n,m,i,j,k=0;
		Scanner var=new Scanner(System.in);
		System.out.println("Enter the size of array A:");
		n=var.nextInt();
		System.out.println("Enter the size of array B:");
		m=var.nextInt();
		int[]a=new int[n];
		int[]b=new int[m];
		int[]c=new int[n+m];
		System.out.println("Enter the elements into array A:");
		for(i=0;i<=a.length-1;i++) {
			a[i]=var.nextInt();
			c[k]=a[i];
			k++;
		}
		System.out.println("Enter the elements of array B:");
		for(j=0;j<=b.length-1;j++) {
			b[j]=var.nextInt();
			c[k]=b[j];
			k++;
		}
		for(k=0;k<=c.length-1;k++) {
		System.out.print(c[k]+ " ");

	}
}
}
