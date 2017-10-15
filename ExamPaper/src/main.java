import java.util.*;


public class main {
	public static void main(String[] args) {
		
		Question q1=new Question('A',1,"what is java","A.oops","B.oopl");
		Question q2=new Question('B',2,"what is Static","A.Access modifire","B.modifire");
		//Question q=new Question('A',1,"what is java","A","B");
		ArrayList<Question> Questions=new ArrayList<Question>();
		Useranswer u=new Useranswer();
		u.UseranswerSetData(100,q1,'A');
		User us=new User();
		us.user("Ramesh", 101,"marupakularamesh@gmail.com",123123,u);
		
		
		
		
		

	}

}
