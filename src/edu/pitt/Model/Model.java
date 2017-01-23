/**
 * 
 */
package edu.pitt.Model;

import java.util.Vector;

//import javax.swing.DefaultListModel;
//import javax.swing.JList;

/**
 * @author andymrkva
 *
 */
public class Model {
	
	private Vector<ListItem> todoList;

//	private JList jlTodos;
//	private DefaultListModel listModel;
	
	/**
	 * @param todoList
	 * @param jlTodos
	 * @param listModel
	 */
	public Model() {
		this.todoList = new Vector<ListItem>();
//		this.jlTodos = jlTodos;
//		this.listModel = listModel;
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
