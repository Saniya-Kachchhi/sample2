
package A.B;
import A.*;
public class Bcd 
{	

	public void s1()// class takes default so do public.
	{
		
		System.out.println("In B Class");
		
	}
}
class B1
{
public static void main(String [] args) 
	{
		Bcd b= new Bcd();
	Abcd a= new Abcd();

	a.s();
	b.s1();
	
		
	}
}