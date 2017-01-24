package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 5 put your implementation here
		char [] arrayInput = input.toCharArray();
		for (int i = 0; i < 2; i++) {
			for(int j = arrayInput.length - 1; j > 0; j--) {
				char temp = arrayInput[j];
				arrayInput[j] = arrayInput[j - 1];
				arrayInput[j - 1] = temp;
			}
		}
		input = "";
		for (int i = 0; i < arrayInput.length; i++) {
			input = input + arrayInput[i];
		}
	  return input;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
