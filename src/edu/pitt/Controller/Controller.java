/**
 * 
 */
package edu.pitt.Controller;
import edu.pitt.Model.Model;
import edu.pitt.View.View;
import edu.pitt.Controller.DeleteButton;
import edu.pitt.Controller.AddButton;
/**
 * @author andymrkva
 *
 */
public class Controller {
	private View view;
	private Model model;
	private AddButton addButton;
	private DeleteButton deleteButton;
	
	/**
	 * @param view
	 * @param model
	 */
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
		this.getView().updateTodoList(this.getModel().getList());
	}

	/**
	 * @return the view
	 */
	public View getView() {
		return view;
	}


	/**
	 * @return the model
	 */
	public Model getModel() {
		return model;
	}

	
	/**
	 * @return the addButton
	 */
	public AddButton getAddButton() {
		return addButton;
	}


	/**
	 * @return the deleteButton
	 */
	public DeleteButton getDeleteButton() {
		return deleteButton;
	}
	
	
}
