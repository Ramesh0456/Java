
public class Constructor {
	Constructor(String name,int id,String designation){
		System.out.println(name+ " "+id +" "+designation);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
public static void main(String args[]) {
	Constructor c=new Constructor("ramesh",101,"java");
	c.add(25, 2);
}
}
