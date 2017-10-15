	class Employe extends Person {
		int emid;
		static String companyname="infosys";
		double salary;
		public Employe(int emid ,double salary)
		{
			this.emid=emid;
		//	this.companyname=collegename;
			this.salary=salary;
			System.out.println("Employee id"+" "+emid);
			System.out.println("Employee company name"+" "+companyname);
			System.out.println("Employee slary"+" "+salary);
			System.out.println(" ");
		}
	}