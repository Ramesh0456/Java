
public class Demo{
	public static void main(String[] args) {
	Address ad=new Address(25, "hyd", "kukatpally","kphb" , "8464868467",5-100/1);
	Employee e=new Employee(ad,"Ramesh",100,200000.0,"devoloper","marupakularamesh@gmail.com");
    System.out.println("employee name       :"+" "+e.name);
    System.out.println("         Id         :"+" "+e.id);
    System.out.println("         Salary     :"+" "+e.salary);
    System.out.println("         Department :"+" "+e.department);
    System.out.println("         Mail id    :"+" "+e.mail);
    System.out.println("         Address    :"+" "+e.ads); 
	}
}