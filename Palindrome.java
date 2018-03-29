package task;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a num");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k,sum=0,p=n;
		while(n>0){
			k=n%10;
			sum=(sum*10)+k;
			n=n/10;
		}if(sum==p){
			System.out.println("palindrome");
		}else System.out.println("not palindrome");
	}

}
