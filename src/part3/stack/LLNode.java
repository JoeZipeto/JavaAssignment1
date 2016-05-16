/*******************************************************************************************
* Project: Comp2080Assign1_Zipeto_Joe
* Assignment:  assignment # 1
* Author(s): Joe Zipeto
* Student Number: 100963441
* Date: Feburary 11, 2016
* Description: This is the node class for palindromes its where you set links and info
* 				for nodes in a stack
 ********************************************************************************************/

package part3.stack;

public class  LLNode<T> {
	protected T info;
	protected LLNode <T> link;
	
	public LLNode(T info)
	{
		this.setInfo(info); 
		this.setLink(null);
	}
	
	public T getInfo() {
		return info;
	}
	
	public LLNode <T> getLink() {
		return link;
	}
	
	public void setInfo(T info) {
		this.info = info;
	}
	
	public void setLink(LLNode <T> link) {
		this.link = link;
	}
}
