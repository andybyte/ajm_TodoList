/**
 * 
 */
package edu.pitt.Model;

/**
 * @author andymrkva
 *
 */
public class ListItem {
	
	private String description;
	
	/**
	 * @param description
	 */
	public ListItem(String description) {
		super();
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
