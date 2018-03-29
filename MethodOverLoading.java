
public class MethodOverLoading {
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String args[]) {
		MethodOverLoading m=new MethodOverLoading();
				m.add(20, 25);
				m.add(2,58,8);
	}
}
