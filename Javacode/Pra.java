package Javacode;
import java.util.*;
public class Pra {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the input String:");
	int len=0,c=0,count=0;
	char[]a=sc.nextLine().toCharArray();
	for(char ch:a){
		len++;	
	}
	System.out.println(len);
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]==' ') {
			count++;
			c=a[i];
		}
	}
	if(count==1) {
		for(int i=0;i<=c;i++) {
			System.out.print(a[i]);
		}
	}
	
}
}


