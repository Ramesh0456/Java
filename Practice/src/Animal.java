class R
 {
   R(int x)
    {
    System.out.println(x);
    }

   R()
   {
      this(25);
     System.out.println("Hello");
   }
 }
 class S extends R
 { 
    S()
   {
     System.out.println("Welcome");
   }
   S(int y)
    { 
	this();
    System.out.println(y);
    }
  public static void main(String args[])
	{
	new S(25);
	}
 }