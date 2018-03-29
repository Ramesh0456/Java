package encapsulation;
import java.util.*;
public class AgeSet {
	private int age;
	public int getAge(){
		return age;		
	}
	public void setAge(int age){
	
		if(age>100)
		{
		 this.age=100;
		 System.out.println("enter u r age less than 100");
		}else if(age<0)
				{
				this.age=0;
				System.out.println("enter u r age greater than Zero");
				}else
					this.age=age;
	}

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
