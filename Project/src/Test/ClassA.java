package Test;



public class ClassA {

	ClassA()
	{
		System.out.println("Zero-args Constructor");
	}
	
	
	ClassA(int i)
	{
		System.out.println("Args Constructor " + i);
	}
	
	public static void main(String[] args) 
	{
			
		ClassA c=new ClassA();
		ClassA c1=new ClassA(10);
		System.out.println(c);
		System.out.println(c1);
	}
}
