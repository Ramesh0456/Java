package task;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ener two numbers");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int temp=x;
		x=y;
		System.out.println(x);
		y=temp;
		System.out.println(y);
	}
}
