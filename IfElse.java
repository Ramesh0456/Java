package task;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a num");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0){
			System.out.println("the given num is even");
		}else System.out.println("the given num is odd");
	}
}