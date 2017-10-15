import java.util.*;
public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AgeSet s=new AgeSet();
System.out.println("enter u r age");
Scanner age=new Scanner(System.in);
int n=age.nextInt();
s.setAge(n);
System.out.println(s.getAge());
	}

}
