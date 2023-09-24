package Javacode;
import java.util.Scanner;
public class Pen1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		char[]a=sc.nextLine().toCharArray();
		int n=0;
		for(char i:a) {n++;}
		int sp1=0,sp2=0,count=0;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]==' ') {
				count++;
				if(count==1) {sp1=i;}
				if(count==2) {sp2=i;}
			}
		}
		if(count==0) {
			System.out.println("no pen found");
		}
		if(count==1) {
			for(int i=0;i<=sp1;i++) {
				System.out.print(a[i]);
			}
		}
		if(count>=2) {
			for(int i=sp2+1;i<=sp1-1;i++) {
				System.out.print(a[i]);
				
				
				
			}
		}
		System.out.println();
		//System.out.println("Total no of char in a string are : " + n);
	}

}
