/*Brian Farias
 * CSE360-85141
 * Assignment 2
 * AddingMachine 
 * Git practice
 */

package cse360assign2;

public class AddingMachine {
	
	private int total;
	StringBuffer history;
	
	public AddingMachine () {
		total = 0;  
		history = new StringBuffer("0");
		}
	public int getTotal () {
		return total;
		}
	public void add (int value) {
		total = total + value; //adds 
		history.append(" + " + value);
		}
	public void subtract (int value) {
		total = total - value;
		history.append(" - " + value);
		}
	public String toString () {
		return history.toString();
		
		}
	public void clear() {
		total = 0;
	}
	
}

