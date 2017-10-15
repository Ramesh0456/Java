import Student.*;
  class Demo
    {
	public static void main(String[] args) 
	{
		char []stt1={'R','A','M','E','S','H'};
		Student st1=new Student(101,560,stt1);
		st1.display();
		char []stt2={'R','A','M','E','S'};
		Student st2=new Student(102,565,stt2);
		st2.display();
		char []stt3={'R','A','M','E'};
		Student st3=new Student(103,556,stt3);
		st3.display();
		char []stt4={'R','A','M'};
		Student st4=new Student(104,566,stt4);
		st4.display();
		char []stt5={'R','A'};
		Student st5=new Student(105,555,stt5);
		st5.display();
	}
}