/**
 * 
 */
package edu.pitt.View;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.border.TitledBorder;

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
	private DefaultListModel listModel;
	
	
	/**
	 * Launch the application to test view.
	 */
	public static void main(String[] args) {
		View window = new View();
		window.frmTodoListFrame.setVisible(true);
	}
	
	/**
	 * Create View GUI.
	 */
	public View() {
		initTodoListFrame();
	}
	
	private void initTodoListFrame() {
		
		// Initialize frame and parts.
		
		listModel = new DefaultListModel();
		jlTodos = new JList(listModel);
		
		frmTodoListFrame = new JFrame("My Todo List");
		frmTodoListFrame.setBounds(100, 100, 400, 400);
		frmTodoListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTodoListFrame.getContentPane().setLayout(null);
		
		// Initialize text elements.
		
		btnAddButton = new JButton("Add Item");
		btnAddButton.setBounds(20,20,100,20);
		btnDeleteButton = new JButton("Delete Item");
		btnDeleteButton.setBounds(275,20,100,20);
		
		frmTodoListFrame.getContentPane().add(btnAddButton);
		frmTodoListFrame.getContentPane().add(btnDeleteButton);
		
		jlTodos.setBounds(20, 40, 355, 300);
		jlTodos.setBorder(BorderFactory.createLineBorder(Color.black));
		frmTodoListFrame.getContentPane().add(jlTodos);
		
	}
}
