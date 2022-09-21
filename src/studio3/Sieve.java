package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter an integer:");
 Scanner scanner = new Scanner(System.in);
 int numb = scanner.nextInt();
 
 for(int i=1; i<=numb ; i++) {
	 boolean prime = true;
	 for(int h=i-1; h>=2; h--) {
		 
		 if(i % h == 0) {
			 prime=false;
			 break;
		 }
	 }
			 if(prime)
				 System.out.println(i+"(prime number)");
		 		
	 			 
		}
	}
}
