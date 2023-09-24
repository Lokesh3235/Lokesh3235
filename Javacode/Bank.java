package Javacode;
import java.util.Scanner;
public class Bank {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO SBI");
		int a, pin=9535,i=1;
		for(i=1;i<=3;i++) {
		System.out.println("Enter the pin number :");
		a=sc.nextInt();
		if(a!=pin) {
			System.out.println("invalid pin please enter again");
		}
		if(a==pin){
			System.out.println("Balance is : 500 rs");
			i=0;
		}
		if(i==3) {
			System.out.println("contact branch for support");
		}
	}
}
}
	
