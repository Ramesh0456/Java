
public class Useranswer {
int userid;
Question qs;
char answer;
public void UseranswerSetData(int userid,Question qs,char answer)
{
this.userid=userid;
this.qs=qs;
this.answer=answer;
System.out.println(userid);
System.out.println(qs);
System.out.println(answer);
}
}