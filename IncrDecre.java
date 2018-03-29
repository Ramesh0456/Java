package practice;

public class IncrDecre {
public static void main(String[] args) {

	for(int i=10;i>=1;i--) {
		System.out.print(--i+" "); //pre decrement
	}
	for(int i=10;i>=1;i--) {
		System.out.print(i--+" "); //post decrement
	}
	for(int i=1;i<=10;i++) {
		System.out.print(++i+" "); //pre increment
	}
	for(int i=1;i<=10;i++) {
		System.out.println(i++); //post increment
	}	
}
}
