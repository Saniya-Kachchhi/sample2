
package A.B.C;
import A.B.*;
public class Cdef  
{	

	public void s3()// class takes default so do public.
	{
		
		System.out.println("In C Class");
		
	}
}
class C1
{
public static void main(String [] args) 
	{
		Cdef c= new Cdef();
			c.s3();
	Bcd b= new Bcd();
	b.s1();
	//b.s3();
	

		

	
		
	}
}