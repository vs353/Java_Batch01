import static java.lang.Math.*;
class JavaBlockExample
{
	static int num1;
	int num2;
	
	static
	{	
		System.out.println("From Static Block2");
		num1=99;
	}
	//First Static Block	
	static
	{	
		System.out.println("From Static Block1");
		num1=60;
	}

	
	
	//First Non-static Block
	{
		System.out.println("From Non-Static Block1");
		num2 =80;		
	}

	public static void main(String[] args) {
		System.out.println(num1);
	}

}





