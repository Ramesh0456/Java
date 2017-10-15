
public class Test {
	Test(){
		System.out.println(this.hashCode());
	}
}
class T extends Test{
	T(){
		System.out.println(this.hashCode());
	}
}
	/**
	 * @param args
	 */
class Main{
	
	public static void main(String[] args) {
		T t=new T();
		System.out.println("ramesh");

	}

}
