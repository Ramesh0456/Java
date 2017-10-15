public class Question {
char key;
int id;
String Question;
String  optionA;
String  optionB;
public Question(char key,int id,String Question,String  optionA,String  optionB)
{
	this.key=key;
	this.id=id;
	this.Question=Question;
	this.optionA=optionA;
	this.optionB=optionB;
	//System.out.println(key);
	System.out.print(id+".");
	System.out.println(Question);
	System.out.println(optionA);
	System.out.println(optionB);
}
}