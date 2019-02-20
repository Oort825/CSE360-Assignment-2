package cse360assign2;

public class Main 
{
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		
		calc.add(10);
		System.out.println(calc.getTotal());
		calc.subtract(2);
		System.out.println(calc.getTotal());
		calc.multiply(2);
		System.out.println(calc.getTotal());
		calc.divide(2);
		System.out.println(calc.getTotal());
	}
	
}
