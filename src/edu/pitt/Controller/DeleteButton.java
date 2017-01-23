/**
 * 
 */
package edu.pitt.Controller;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import edu.pitt.Controller.Controller;
import edu.pitt.Model.Model;

/**
 * @author andymrkva
 *
 */
public class DeleteButton {
	private Controller controller;

	/**
	 * @param controller
	 */
	public DeleteButton(Controller controller) {
		super();
		this.controller = controller;
	}
	
	public void actionPerformed(ActionEvent e) {
//		if (Model.jlTodos.getSelectedValue() == null) {
//			JOptionPane.showMessageDialog(null, "Please select a task to delete.");
//		} else {
//			Object item = Model.jlTodos.getSelectedValue();
//			Model.listModel.removeElement(item);
//		};	
	}
}
