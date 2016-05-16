/*******************************************************************************************
* Project: COMP2080Assign1_Zipeto_Joe
* Assignment: < assignment 1 >
* Author(s): Joe Zipeto
* Student Number: 100963441
* Date: Feburary 11, 2016
* Description: This file will check for palindromes in a file if provided by user 
* 				in console or by the palindrome.txt file 
 ********************************************************************************************/

package part1.driver;

import java.math.BigInteger;
import javax.swing.JOptionPane;
import part1.classes.Stopwatch;
import part1.classes.Timing;

public class TestTiming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stopwatch timer = new Stopwatch(); // create a Stopwatch object to keep
											// track of time.
		Boolean result = true;
		int reply;
		while (result) {

			String output = "Value of n           Time in Seconds \n";
			output += "___________________________\n";// create a
														// outout string
														// to
														// display the
														// results to
														// users

			// create a menu using joptionpane to run the tests
			String[] choices = { "daffy()", "donald()", "mickey()", "minnie()", "goofy()", "pluto()", "gyro()",
					"fact()" };
			String input = (String) JOptionPane.showInputDialog(null, "Choose what to test...", "Test Driver",
					JOptionPane.QUESTION_MESSAGE, null, // Use
														// default
														// icon
					choices, // Array of choices
					choices[1]); // Initial choice.out.print(s);

			// end menu creation

			// switch statement to handle the menu choice.
			switch (input) {
			case "daffy()": {
				output += testDaffy(timer);
				break;
			}
			case "donald()": {
				output += testDonald(timer);
				break;
			}
			case "mickey()": {
				output += testMickey(timer);
				break;
			}
			case "minnie()": {
				output += testMinnie(timer);
				break;
			}
			case "goofy()": {
				output += testGoofy(timer);
				break;
			}
			case "gyro()": {
				output += testGyro(timer);
				break;
			}
			case "pluto()":{
				output += testPluto(timer);
			}
			case "fact()": {
				output += testFact(timer);
				break;
			}
			
			// the output of the method is displayed in joptionpane
}
			JOptionPane.showMessageDialog(null, output);
			reply = JOptionPane.showConfirmDialog(null, "Would You Like To Do Another Test? ", "Test Methods ",
					JOptionPane.YES_NO_OPTION);

			if (reply == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Thank You, GoodBye");
				result = false;
			}
		}
		/************************************
		 * Testers for console
		 ************************************/

		 System.out.println(testDaffy(timer));
		// System.out.println(testDonald(timer));
		// System.out.println(testMickey(timer));
		// System.out.println(testMinnie(timer));
		// System.out.println(testGoofy(timer));
		// System.out.println(testPluto(timer));
		// System.out.println(testGyro(timer));
		// System.out.println(testFact(timer));
		/***************************************************************************/
	}

	public static String testDaffy(Stopwatch timer) {
		// PostCondition:: prints out the Time results of the method to the
		// screen
		String output = "";
		for (int i = 100; i <= 100; i++) {

			timer.start();
			Timing.daffy(i);
			timer.stop();
			
			output += "    " + i + "                    " + timer.time() + "\n";
		}
		return output;
	}

	public static String testDonald(Stopwatch timer) {
		// PostCondition:: prints out the Time results of the method to the
		// screen

		String output = "";
		for (int i = 30; i <= 44; i++) {

			timer.start();
			Timing.donald(i);
			timer.stop();

			output += "    " + i + "                    " + timer.time() + "\n";
		}
		return output;
	}

	public static String testMickey(Stopwatch timer) {
		// PostCondition:: prints out the Time results of the method to the
		// screen
		String output = "";
		int[] newArray;
		for (int i = 1000; i <= 8192000.; i += i) {
			newArray = Timing.randomarr(i);

			timer.start();
			Timing.mickey(newArray);
			timer.stop();
			output += formatOutput(timer, i);
		}
		return output;
	}

	public static String testMinnie(Stopwatch timer) {
		// PostCondition:: prints out the Time results of the method to the
		// screen

		String output = "";
		int[] newArray = new int[1000];
		for (int i = 1000; i <= 256000; i += i) {
			newArray = Timing.randomarr(i);

			timer.start();
			Timing.minnie(newArray);
			timer.stop();
			output += formatOutput(timer, i);
		}
		return output;
	}

	public static String testGoofy(Stopwatch timer) {
		// PostCondition:: prints out the Time results of the method to the
		// screen

		String output = "";
		int[] newArray;
		for (int i = 1000; i <= 256000; i += i) {
			newArray = Timing.randomarr(i);

			timer.start();
			Timing.goofy(newArray);
			timer.stop();

			output += formatOutput(timer, i);		}
		return output;
	}

	public static String testPluto(Stopwatch timer) {
		// PostCondition:: prints out the Time results of the method to the
		// screen

		String output = "";
		int[] newArray;
		for (int i = 1000; i <= 256000; i += i) {
			newArray = Timing.randomarr(i);

			timer.start();
			Timing.pluto(newArray);
			timer.stop();

			output += formatOutput(timer, i);
		}
		return output;
	}

	public static String testGyro(Stopwatch timer) {
		// PreCondition:: Integers are only allowed
		// PostCondition:: prints out the Time results of the method to the
		// screen

		String output = "";
		int[] newArray;
		for (int i = 1000; i <= 256000; i += i) {

			newArray = Timing.randomarr(i);

			Timing.pluto(newArray); // Call pluto() on newArray before timer
									// starts

			timer.start();
			Timing.gyro(newArray);
			timer.stop();

			output += formatOutput(timer, i);

		}
		return output;
	}

	public static String testFact(Stopwatch timer) {

		String output = "";
		for (int i = 1000; i <= 64000; i += i) {
			BigInteger big = BigInteger.valueOf((long) i);
			timer.start();
			Timing.fact(big);
			timer.stop();
			output += formatOutput(timer, i);
		}

		return output;
	}
	public static String formatOutput(Stopwatch timer, int i)
	{
		String output = "";
		
		if(i < 10000)
			output += "      " + i + "                    " + timer.time() + "\n";
		else if (i < 100000)
			output +=   "    " + i + "                    " + timer.time() + "\n";
		else if( i < 1000000)
			output +=    "  " + i + "                    " + timer.time() + "\n";
		else
			output +=   i + "                    " + timer.time() + "\n";
		
		return output;
	}
}
