/*******************************************************************************************
* Project: Comp2080Assign1_Zipeto_Joe
* Assignment: < assignment # >
* Author(s): Joe Zipeto
* Student Number: 100963441
* Date: Feburary 11, 2016
* Description: This file is the stack which will have charactors pushed into them
* 				and check for palindromes
* 			
 ********************************************************************************************/
package part3.stack;

public class LLStack<T> {

	protected LLNode<T> stack;

	public void pop() {
		// PreCondition:: Make sure the stack is not empty
		// PostCondition::

		if (!isEmpty()) {
			stack = stack.getLink();
		}
	}

	public void push(T element) {
		// PreCondition:: Make sure the stack is not empty
		// PostCondition:: set the stack to the new element

		LLNode<T> newNode = new LLNode<T>(element);
		newNode.setLink(stack);
		stack = newNode;
	}

	public T top() {
		// PreCondition:: Make sure the stack is not empty
		// PostCondition:: return the top of the stack

		T topNode = null;
		if (!isEmpty())
			topNode = (T) stack.getInfo();
		else
			return null;
		return topNode;
	}

	public boolean isEmpty() {
		// PreCondition:: Make sure the stack is not empty
		// PostCondition:: return true if empty and false if not empty
		if (stack == null)
			return true;
		else
			return false;
	}

	public void clear() {
		while (stack != null) {
			pop();
		}
	}

	public String reverse() {
		// PreCondition:: stack cannot be null
		// PostCondition:: return stack that has all charactors reversed

		LLStack<T> iterativeStack = new LLStack<T>();
		LLNode<T> copyNode;
		String reverseString = "";
		copyNode = stack; // temp variable so we do not destroy the stack
							// use the iterativeStak variable to store the
							// reversed stack

		while (copyNode != null) {
			iterativeStack.push(copyNode.getInfo());
			copyNode = copyNode.getLink();
		}

		while (!iterativeStack.isEmpty()) {
			reverseString += iterativeStack.top();
			iterativeStack.pop();
		}
		return reverseString;
	}

	public boolean isPalindrome(String str) {
		LLNode<T> copyNode;
		copyNode = stack;
		String newString = "";

		while (copyNode != null) {
			newString += copyNode.getInfo();
			copyNode = copyNode.getLink();
		}
		return str.equals(newString);
	}

}
