package aggre;

public class Operation {
void add(int a, int b) {
	System.out.println("sum="+( a+b));
}
void mult(int a, int b) {
	System.out.println("mul="+( a*b));}

	public static void main(String[] args) {
		// TODO Auto-generated
		 Operation o=new  Operation();
		 o.add(5, 5);
	}

}
