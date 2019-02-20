/**Name: Jacob Babik
 *Class ID: 321
 *Assignment 2
 *
 *Class Description: 
 *This class consist of a constructor (Calculator()), a private global,
 *integer, one method that returns an integer, one method that returns
 * a string, and four void methods.
 *
 *When the add(), subtract(), multiply(), or divide() methods are 
 *called and passed an integer, the appropriate operation will be
 *performed. After the operation is performed, the total will be updated.
 *The getTotal() method will return the total value at the time it is
 *called. The getHistory()  method will return the history of operations
 *previously performed when called.
 * 
 */
package cse360assign2;
public class Calculator 
{
private int total;

	/**
	 * The Calculator() method is the constructor for the Calculator
	 * class. It initializes the total integer to 0.
	 */

	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * The getTotal() method returns the updated total of all of
	 * the operations that have been performed
	 * 
	 * @return total - the numerical total of all operations that
	 * have been performed.
	 */
	
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * The add() method takes in an integer. It then adds this
	 * integer to the total and updates the total integer value.
	 * Additionally, it will update the history of operations.
	 * 
	 * @param value - the number passed in by the user.
	 */
	
	public void add (int value) 
	{
		total = total + value;
	}
	
	/**
	 * The subtract() method takes in an integer. It then subtracts
	 * the parameter from the total and updates the total value.
	 * Additionally, it updates the history of operations.
	 * 
	 * @param value - the number passed in by the user. 
	 */
	
	public void subtract (int value) 
	{
		total = total - value;
	}
	
	/**
	 * The multiply() method takes in an integer. It then multiplies
	 * the total by the parameter and updates the total. Additionally,
	 * it updates the history of operations. 
	 * 
	 * @param value - the value passed in by the user.
	 */
	
	public void multiply (int value) 
	{
		total = total * value;
	}
	
	/**
	 * The divide() method takes in an integer. It then divides the
	 * total by the parameter and updates the total value.
	 * Additionally, it updates the history of operations. 
	 * 
	 * @param value - the value passed in by the user.
	 */
	
	public void divide (int value) 
	{
		if(value == 0)
		{
			total=0;
		}
		else 
		{
			total = total / value;
		}
	}
	
	/**
	 * The getHistory() method returns the history of operations
	 * performed as a string. 
	 * 
	 * @return history - a string created by concatenating all
	 * of the operations performed. 
	 */
	
	public String getHistory () 
	{
		return "";
	}

}
