package Student;
public class Student
{
	int id;
	int marks;
	char[] name;
	public Student(int a,int b,char[] c)
	{
		id=a;
		marks=b;
		name=c;
	}
	public void display()
	{
		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]);
		}	System.out.println();
		System.out.println("id is"+" "+id);
		System.out.println("marks"+" "+marks);
			
	}
}
