package Javacode;
import java.util.*;
public class Penltimate {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input String of pen:");
		char[]a=sc.nextLine().toCharArray();
		int n=0;
		for(char i:a) {n++;}
		System.out.println("length:"+n);
		int sp1=0,sp2=0,count=0;
		for(int i=n-1;i>=0;i--)
		{
			if(a[i]==' '){
				count++;
				if(count==1) {sp1=i;}
				if(count==2) {sp2=i;}
				//System.out.println("inside Space");
			}
		}
		if(count==0) {System.out.println("no penultimate is found");
	}
		if(count==1) {
			for(int i=0;i<=sp1-1;i++) {
				System.out.print( a[i]);
			}
		}
		if(count==2) {
			for(int i=sp1;i<=sp2;i++) {
				System.out.print(a[i]);
			}
		}
	}
}
