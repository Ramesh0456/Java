import java.util.*;
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> r=Arrays.asList("gvk","asian","prasad","pvr");
		//List<String> m=Arrays.asList("fidha","ninnu kori","baahubali","mirchi");
		
		Ticketbooking t=new Ticketbooking();
		Ticketbooking[] tic=new Ticketbooking[r.size()];		
			tic[0]=new Ticketbooking(65,100,70,r.get(0));
			tic[1]=new Ticketbooking(72,80,35,r.get(1));
			tic[2]=new Ticketbooking(56,120,70,r.get(2));
			tic[3]=new Ticketbooking(12,100,70,r.get(3));
			//while(true){
				   for(int i=0;i<3;i++){
					  tic[i].display();
				   }
					System.out.println("enter theater name");
					Scanner hall=new Scanner(System.in);
					String hallname=hall.next();
					 for(int k=0;k<tic.length;k++){
						 if(tic[k].theatre_name.equals(hallname)){
		             System.out.println(tic[k].movie_name);							 
                     System.out.println("available seats"+" "+tic[k].num_of_seats);							 
					booking(tic[k]);
						 }
					 }
			}
	 public static void booking(Ticketbooking a){
		char [][] layout={{'e','e','e','e','e','e','e','e','e'},
						  	{'e','e','e','e','e','e','e','e','e'},
							{'e','e','e','e','e','e','e','e','e'},
							{'e','e','e','e','e','e','e','e','e'},
							{'e','e','e','e','e','e','e','e','e'},
							{'e','e','e','e','e','e','e','e','e'},
							{'e','e','e','e','e','e','e','e','e'},
							{'e','e','e','e','e','e','e','e','e'},
							{'e','e','e','e','e','e','e','e','e'},
							{'e','e','e','e','e','e','e','e','e'},
							{'e','e','e','e','e','e','e','e','e'},}; 
				 int value=1;
				 Scanner obj=new Scanner(System.in);
			 		while(value!=4)
			 		{
			 		System.out.println("1 to book a ticket ");
			 		System.out.println("2 to cancle a ticket");
			 		System.out.println("3 to show layout");
			 		System.out.println("4 to exit");
			 		// taking user input 
			          value=obj.nextInt();
			 		// seat layout declared
			 		if(value==1)
			 		{         // ticket booking
			 			System.out.println("enter seat number");
			 			int i=obj.nextInt();
			 			int j=obj.nextInt();
			 			if(layout[i][j]=='e' &&  i<=layout[0].length)
			 			{
			 			    layout[i][j]='B';
		 			    	System.out.println("ticket booked succesfully");

			 			}
			 			    /*System.out.println("payment gateway");
			 			    System.out.println();
			 			    System.out.println("account no");
			 			    int acc_no=obj.nextInt();
			 			    System.out.println("pin");
			 			    int pin=obj.nextInt();
			 			    if(pin==b.pin && acc_no==b.account_number)
			 			    { 
			 			   payment=b.moneytransfer(a2); 
			 			    if(payment==true){
			 			    	System.out.println("ticket booked succesfully");
			 			    }
			 			    }
			 			} */
			 		else if(layout[i][j]=='B')
			 			{
			 				System.out.println("Sorry the ticket is already booked");
			              
			 			}
			 		}     //ticket cancellation
			 		else if(value==2)
			 		{
			 			System.out.println("enter seat number to cancle ticket");
			 			int i=obj.nextInt();
			 			int j=obj.nextInt();
			 			if(layout[i][j]=='B') 
			 			{
			 				layout[i][j]='e';
			 				System.out.println("your ticket is cancled succesfully");	
			 				//a2.noof_seats=a2.noof_seats-1;
			 			}
			 			else
			 			{
			 				System.out.println("OOPS! you haven't booked any ticket");
			 			}
			 		}//showing layout
			 		 if(value==3)
			 		{    
			 			System.out.println("showing seat layouts");
			 		     
			 				for(int i=0;i<layout.length;i++)
			 				{  
			 				for(int j=0;j<layout[0].length;j++){
			 				  
			 					System.out.print(i+","+j+"{"+layout[i][j]+"} ");
			 					
			 					
			 				}
			 				System.out.println();
			 				}
			 		}//exit 
			 		else if(value==4)
			 		{
			 			System.out.println("Thankyou");
			 		}	
			 	}
					//return null;
			 }
		 
		 
	 }
	

