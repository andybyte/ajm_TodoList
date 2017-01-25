/**
 * 
 */
package edu.pitt.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

import edu.pitt.Model.ListItem;
import edu.pitt.Model.Model;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;

import java.awt.Color;

//import edu.pitt.Controller.*;
//import edu.pitt.Model.*;
//import javax.swing.JOptionPane;
//import javax.swing.DefaultListModel;


/**
 * @author andymrkva
 *
 */
public class View {
	// private Controller controller;
	
	private JFrame frmTodoListFrame;
	private JButton btnAddButton;
	private JButton btnDeleteButton;
	private JList jlTodos;
	
	/**
	 * @param frmTodoListFrame
	 * @param btnAddButton
	 * @param btnDeleteButton
	 */
	public View() {
		this.frmTodoListFrame = new JFrame("My Todo List");
		this.btnAddButton = new JButton();
		this.btnDeleteButton = new JButton();
//		this.jlTodos = new JList();
		initTodoListFrame();
		this.frmTodoListFrame.setVisible(true);

	}

	private void initTodoListFrame() {
				
		frmTodoListFrame.setBounds(100, 100, 400, 400);
		frmTodoListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTodoListFrame.getContentPane().setLayout(null);
		
		// Initialize text elements.
		
		btnAddButton = new JButton("Add Item");

		btnDeleteButton = new JButton("Delete Item");

		btnAddButton.setBounds(20,20,100,20);

		
		btnDeleteButton.setBounds(275,20,100,20);

		
		
		frmTodoListFrame.getContentPane().add(btnAddButton);
		frmTodoListFrame.getContentPane().add(btnDeleteButton);
		
		
	}
	
	public void updateTodoList(Vector<ListItem> todoList) {
		JList<ListItem> jlTodos = new JList<ListItem>(todoList);
		jlTodos.setBounds(20, 40, 355, 300);
		jlTodos.setBorder(BorderFactory.createLineBorder(Color.black));
		frmTodoListFrame.getContentPane().add(jlTodos);
		System.out.print("Hello");
		this.frmTodoListFrame.setVisible(true);
	}
	
	public JButton getAddButton() {
		return btnAddButton;
	}
}
