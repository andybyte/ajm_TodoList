/**
 * 
 */
package edu.pitt.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import edu.pitt.Controller.Controller;
import edu.pitt.Model.Model;

/**
 * @author andymrkva
 *
 */
public class AddButton implements ActionListener {
	private Controller controller;
	
	/**
	 * @param controller
	 */
	public AddButton(Controller controller) {
		this.controller = controller;
		controller.getView().getAddButton().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		System.out.print("Working");
//		String task = JOptionPane.showInputDialog("Please enter a task: ");
//		if (task != " ") {
//			listModel.addElement(task); 
//		}
		
	}
}
