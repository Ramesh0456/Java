
public class Const {
int id;
String Name;
static double sal;

String Domain;
void details(int id, String name,String Domain,double sal){
	this.id=id;
	this.Name=name;
	this.Domain=Domain;
	this.sal=sal;
	
	
	System.out.println(id+" "+name+" "+Domain+" "+sal);
}

	public static void main(String[] args) {
		//System.out.println(companyname);
		// TODO Auto-generated method stub
Const c=new Const();
System.out.println("Grepthor soft sol");
c.details(1,"rakesh","java",20000);
System.out.println("tesla soft sol");
c.details(2,"ramesh","java",15000);
	}

}
