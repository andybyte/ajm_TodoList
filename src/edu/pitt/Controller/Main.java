/**
 * 
 */
package edu.pitt.Controller;

import edu.pitt.Model.Model;
import edu.pitt.View.View;

/**
 * @author andymrkva
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		View frame = new View();
		Model model = new Model();
		Controller controller = new Controller(frame, model);

	}

}
