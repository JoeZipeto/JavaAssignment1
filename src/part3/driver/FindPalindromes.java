package part3.driver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import part3.stack.LLStack;

public class FindPalindromes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// object,variable, and array creation;
		LLStack<String> newStack = new LLStack<String>();
		String result = "", originalLine;
		String[] test;
		String line;

		// checks if a user has input a file in the console
		File file = args.length > 0 ? new File(args[0]) : new File("src\\part3\\driver\\palindrome.txt");

		// Create a reader object to read a file
		BufferedReader reader = new BufferedReader(new FileReader(file));

		// loop through the file checking each line and store characters in a
		// stack
		while ((line = reader.readLine()) != null) {
			originalLine = line.toLowerCase();
			test = split(originalLine); // split line method

			for (int i = 0; i < test.length - 1; i++) {
				if (test[i] != null)
					newStack.push(test[i]);
			}

			// Call the reverse stack and store the string
			String newString = newStack.reverse();

			// tests if it is a Palindrome and gives the result to a string to
			// be printed out

			result += newStack.isPalindrome(newString)
					? "\n" + originalLine + "......................... is a PalinDrome"
					: "\n" + originalLine + "......................... is Not a PalinDrome";

			// Clears the stack
			newStack.clear();
		}

		JOptionPane.showMessageDialog(null, result, "PalinDrome Test", 1);
		reader.close();
	}

	public static String[] split(String s) {
		// PreCondition:: has to be a string
		// PostCondition:: returns a array of letters
		// omitting special characters and numbers

		char[] c = s.toCharArray();
		String[] properStringArray = new String[c.length];
		for (int i = 0, d = 0; i < c.length; i++) {
			if (c[i] >= 'a' && c[i] <= 'z') {
				properStringArray[d] = c[i] + "";
				d++;
			}
		}
		return properStringArray;
	}

}
