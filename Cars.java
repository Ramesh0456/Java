package inheritance;

class Cars
{
	void car() {
		System.out.println("Welcome to car Showroom");
	}
}
class Ford extends Cars
{
	void ford() {
		System.out.println("model=2014");
	}
}
class Gears extends Ford
{
	void gears() {
		System.out.println("front gears");
}
	public static void main(String[] args) {
		Gears g=new Gears();
	g.car();
	g.ford();
	g.gears();
	}}