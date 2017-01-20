/**
 * 
 */
package edu.pitt.Model;

import java.util.Vector;

/**
 * @author andymrkva
 *
 */
public class Model {
	
	private Vector<ListItem> todoList = new Vector<ListItem>();
	
	/**
	 * @param todoList
	 */
	public Model(Vector<ListItem> todoList) {
		super();
		this.todoList = todoList;
	}

	public void addListItem(ListItem obj) {
		todoList.addElement(obj);
	}
	
	public void deleteListItem(ListItem obj) {
		todoList.removeElement(obj);
	}
	
	public Vector<ListItem> getList() {
		return todoList;
	}
}
