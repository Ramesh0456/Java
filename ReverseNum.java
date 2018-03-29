package task;

import java.util.Scanner;

public class ReverseNum {
public static void main(String[] args) {
	System.out.println("ener a number");
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y,temp=0;
	while(x>0){
		y=x%10;
		x=x/10;
		temp=(temp*10)+y;
	}
	System.out.println(temp);
}
}
