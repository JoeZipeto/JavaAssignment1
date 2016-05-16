package part2.driver;

import part2.exception.COMP2080AssignmentInputException;
import part2.stringrecursion.StringRecursion;

public class TestRecursion {

	public static void main(String[] args) throws COMP2080AssignmentInputException {
		// TODO Auto-generated method stub

		// method #3
		System.out.println("********************************************************");
		System.out.println("**  Check if the print with spaces function works     **");
		System.out.println("********************************************************");
		StringRecursion.printWithSpaces("Print With Spaces Works");
		System.out.println();

		// method #2
		System.out.println("********************************************************");
		System.out.println("**  Check if the weave function works                 **");
		System.out.println("********************************************************");
		System.out.println("Weaving aaaa and bbbb results in............ " + StringRecursion.weave("aaaa", "bbbb"));
		System.out.println("Weaving hello and world results in.......... " + StringRecursion.weave("hello", "world"));
		System.out.println("Weaving recurse and NOW results in.......... " + StringRecursion.weave("recurse", "NOW"));
		System.out.println("Weaving hello and '' results in............. " + StringRecursion.weave("hello", ""));
		System.out.println("Weaving '' and world results in............. " + StringRecursion.weave("", "world"));
		System.out.println();
		System.out.println("These next two will pass null to either of the parameters ");
		try {
			System.out.println("If you see this the exception does not work " + StringRecursion.weave(null, "hi"));
		} catch (COMP2080AssignmentInputException ex) {
			System.out.println(ex.getLocalizedMessage());
		}

		try {
			System.out.println("If you see this the exception does not work " + StringRecursion.weave("hi", null));
		} catch (COMP2080AssignmentInputException ex) {
			System.out.println(ex.getLocalizedMessage());
		}

		// method #3
		System.out.println("");
		System.out.println("********************************************************");
		System.out.println("**          Check if last index of works              **");
		System.out.println("********************************************************");
		System.out.println(
				"Searching for character 'r' in recurse........... " + StringRecursion.lastIndexOf('r', "recurse"));

		System.out.println(
				"Searching for character 'r' in recurse.......... " + StringRecursion.lastIndexOf('p', "recurse"));
	}
}
