package Package1;

public class Calculator 
{
	public void sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Addtion is =" +c);
	}

	public void sub(int a1, int b1)
	{
		int c1=a1-b1;
		System.out.println("Subtraction is =" +c1);
	}
	
	public void mul(int a2, int b2)
	{
		int c2=a2*b2;
		System.out.println("Multiplication is =" +c2);
	}
	
	public void div(int a3, int b3)
	{
		int c3=a3/b3;
		System.out.println("Division is ="  +c3);
	}
	
	public static void main (String[] args)
	{
	
	Calculator cal = new Calculator();
	cal.sum(10, 20);
	cal.sub(20, 10);
	cal.mul(20, 10);
	cal.div(200, 10);
	
	}
	
}
