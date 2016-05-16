/*******************************************************************************************
* Project: COMP2080Assign1_zipeto_joe
* Assignment: < assignment # >
* Author(s): Joe Zipeto
* Student Number: 100963441
* Date: Feburary 12, 2016
* Description: String recursion class that uses recursion to 
* 			   1) Print a string with spaces
* 			   2) Print the weave of two strings
* 			   3) Print the last index of a character in a sting 
 ********************************************************************************************/

package part2.stringrecursion;

import part2.exception.COMP2080AssignmentInputException;

public class StringRecursion {
	public static void printWithSpaces(String str) {
		//PreCondition:: str cannot be null
		//PostCondtion:: prints and removes the first character with a space and sends the rest 
		//				 of string to the method again.
		
		if (str.length() == 0) 
		{
			System.out.println();
		}
		else 
		{
			System.out.print(str.charAt(0) + " ");
			str = str.substring(1);
			printWithSpaces(str);
		}
	}

	public static String weave(String str1, String str2) throws COMP2080AssignmentInputException {
		//PreCondition:: str1 and str2 cannot be null
		//PostCondition::Returns a weave of str1 and str2 by concatenating the first character of both strings
		//				 then removes those characters and send the rest of the string to the method
		if(str1 == null|| str2 == null)
		{
			throw new COMP2080AssignmentInputException("Input parameters cannot be null");
		}
		
		if (str1.length() == 0 || str2.length() == 0) {
			return str1 + str2;
		}
		return str1.substring(0, 1) + str2.substring(0, 1) + weave(str1.substring(1), str2.substring(1));
	}

	public static int lastIndexOf(char ch, String str) {

		//PreCondition:: ch cannot be null
		//PostCondition:: Checks if the string length is zero, then checks if the last charactor matches ch,
		//					if it dosent match it sends the rest of the string minus the last charactor to the 
		//					Method.
		
		if (str.length() == 0)
			return -1;
		if(str.charAt(str.length() -1) == ch)
		{
			return str.length() -1; 
		}
		return lastIndexOf(ch,str.substring(0,str.length() - 1));
	}
}
