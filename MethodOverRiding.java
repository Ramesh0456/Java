public class MethodOverRiding {
 void add(int a,int b) {
		System.out.println("hiii");
		System.out.println(a+b);
	}
}
	 class S extends MethodOverRiding{
		void add(int a,int b) {
			System.out.println("HI");
			System.out.println(a+b);
		}
	
	
	public static void main(String args[]) {
		S b=new S();
		b.add(8, 8);
	}
}
