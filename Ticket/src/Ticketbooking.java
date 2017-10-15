
public class Ticketbooking {
int seat_no;
int num_of_seats;
int price;
int screen_size;
String theatre_name; 
static String movie_name;
	public Ticketbooking()
	{
		movie_name="Fidha movie";
		System.out.println("showing theatres for"+" "+movie_name);
		System.out.println("----------------------------");
	}
		public Ticketbooking(int b,int c,int d,String e){
		num_of_seats=b;
		price=c;
		screen_size=d;
		theatre_name=e;		
		
		}
		public	void display(){
				//System.out.println("movie name:"+" "+movie_name);
				System.out.println("theatre name:"+" "+theatre_name);
				System.out.println("num of empty seats:"+" "+num_of_seats);
				System.out.println("Sreen size:"+" "+screen_size+"mm");
				System.out.println("price:"+" "+price+"$");
				System.out.println("****************************");
			}

}
