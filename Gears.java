package aggre;

public class Gears {
public Gears(int mil,double model,String cname,Bike bike) {
	System.out.println(mil+" "+model+" "+cname);
}
public static void main(String[] args) {
	Bike b=new Bike(25,"Rakesh",2500);
	Gears g=new Gears(45,2014,"pulsor",b);
}
}
