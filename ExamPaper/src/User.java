public class User {
String name;
int id;
String email;
int password;
Useranswer user;
public void user(String name,int id,String email,int password,Useranswer user)
{
	this.name=name;
	this.id=id;
	this.email=email;
	this.password=password;
	this.user=user;
	System.out.println(name);
	System.out.println(id);
	System.out.println(email);
	System.out.println(password);
	System.out.println(user);
}
}