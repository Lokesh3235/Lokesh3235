
package Javacode;
import java.util.*;
public class RevStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  string");
			char a[]=sc.nextLine().toCharArray();
			int k,i=0,j=a.length-1;
			for(k=0;k<=a.length/2;k++) {
				char c=a[i];
				a[i]=a[j];
				a[j]=c;
				i++;j--;
		}
		for(k=0;k<=a.length-1;k++) {
			System.out.print(a[k]+" ");
		}
		
	}

}
