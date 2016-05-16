/*******************************************************************************************
* Project: COMP2080Assign1_zipeto_joe
* Assignment: Assignment #1
* Author(s): Joe Zipeto
* Student Number: 100963441
* Date: Feburary 12, 2016
* Description: This file  is the exception class to check for null values 
 ********************************************************************************************/

package part2.exception;

public class COMP2080AssignmentInputException extends Exception {

	public COMP2080AssignmentInputException ()
	{
		super();
	}
	
	public COMP2080AssignmentInputException (String message)
	{
		super(message);
	}

}
