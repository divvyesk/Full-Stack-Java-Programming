import java.util.*;
import java.lang.*;
import java.io.*;

class Calculate
{
	void calc(int num1, int num2, String op)
	{
		switch(op)
		{
			case "+" : System.out.println(num1+" + "+num2+" = "+(num1+num2));
			break;

			case "-" : System.out.println(num1+" - "+num2+" = "+(num1-num2));
			break;

			case "*" : System.out.println(num1+" * "+num2+" = "+(num1*num2));
			break;

			case "/" : System.out.println(num1+" / "+num2+" = "+(num1/num2));
			break;

			case "%" : System.out.println(num1+" % "+num2+" = "+(num1%num2));
			break;

			default: System.out.println("Invalid input!");
		}	
	}


	void calc(float x, float y, String op)
	{
		switch(op)
		{
			case "+" : System.out.println(x+" + "+y+" = "+(x+y));
			break;

			case "-" : System.out.println(x+" - "+y+" = "+(x-y));
			break;

			case "*" : System.out.println(x+" * "+y+" = "+(x*y));
			break;

			case "/" : System.out.println(x+" / "+y+" = "+(x/y));
			break;

			case "%" : System.out.println(x+" % "+y+" = "+(x%y));
			break;	

			default: System.out.println("Invalid input!");
		}	
	}
	
}


class experiment2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select data type of numbers (I=int and F= float): ");
		String type = sc.nextLine();

		if(type.equals("I"))
		{
			System.out.println("Enter first number: ");
			int a = sc.nextInt();
			System.out.println("Enter second number: ");
			int b = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter your operation (+,-,*,/,%): ");
			String op = sc.nextLine();

			Calculate obj = new Calculate();
			obj.calc(a,b,op);
		}		
		
		else if(type.equals("F"))
		{
			System.out.println("Enter first number: ");
			float c = sc.nextFloat();
			System.out.println("Enter second number: ");
			float d = sc.nextFloat();

			sc.nextLine();
			
			System.out.println("Enter your operation(+,-,*,/,%): ");
			String op = sc.nextLine();		
		
			Calculate obj = new Calculate();
			obj.calc(c,d,op);
		}

		else
		{
			System.out.println("Invalid input try again!");
		}
		

	}
}