	class Studentt extends Person {
		int marks;
		int id;
		static String collegename="samskruti";
		
		public Studentt(int marks,int id)
		{
			
		//super(age,name,height,weight);
			this.marks=marks;
			this.id=id;
			//this.collegename;
			System.out.println("Student marks"+" "+marks);
			System.out.println("Student id"+" "+id);
			System.out.println("Student college name"+" "+collegename);
			System.out.println(" ");
		}
	}