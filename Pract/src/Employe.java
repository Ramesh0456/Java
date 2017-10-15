
public class Employe {
int id;
double salary;
String name;
//Static String comName="infosys";
Employe (String name1,int id1,double salary1)
{
	id=id1;
	salary=salary1;
	name=name1;
}
void display()
{
	System.out.println(name);
System.out.println( id);
System.out.println(salary);

}
	public static void main(String[] args) 
	{
		String S1="eshwar";
		Employe e1=new Employe(S1,2,4000);
		e1.display();
		String S2="suresh";
		Employe e2=new Employe(S2,3,5000);
		e2.display();
		String S3="ramesh";
		Employe e3=new Employe(S3,4,6000);
		e3.display();
	}

}
