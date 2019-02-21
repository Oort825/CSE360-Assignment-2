package cse360assign2;

public class Main 
{
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		calc.add(10);
		calc.multiply(20);
		System.out.println(calc.getTotal());
		System.out.println(calc.getHistory());
		calc.subtract(13);
		System.out.println(calc.getTotal());
		System.out.println(calc.getHistory());
		calc.divide(7);
		System.out.println(calc.getTotal());
		System.out.println(calc.getHistory());
		calc.add(10);
		System.out.println(calc.getTotal());
		System.out.println(calc.getHistory());
	}
	
}
