/**
 * Names class
 * This class contains tasks related to the use of the Strings class.
 *
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Names {

	// Task 1

	/**
	 * takes a string and returns it in uppercase
	 * @param name variable holds name
	 * @return returns uppercase name
	 */
	 public String upperCaseName (String name) {
		return name.toUpperCase();
	}

	// Task 2

	/**
	 * concatenates the first and last name
	 * @param firstN holds first name
	 * @param lastN holds last name
	 * @return returns full name
	 */
	 public String fullName(String firstN, String lastN) {
		return firstN + " " + lastN;
	}

	// Task 3

	/**
	 * finds the length of given string
	 * @param name holds name
	 * @return returns the length of the string
	 */
	 public int letterCount(String name) {
		return name.length();
	}

	// Task 4

	/**
	 * finds if the strings are equal, regardless of case
	 * @param name1 holds the first name
	 * @param name2 holds the second name
	 * @return returns true or false if the strings are equal or not
	 */
    public Boolean theSameName (String name1, String name2) {
		return name2.equalsIgnoreCase(name1);
	}

	// Task 5

	/**
	 * returns the name with the first letter uppercase and the rest lowercase
	 * @param name holds name
	 * @return returns corrected name
	 */
	 public String properCaseName(String name ) {
		return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
	}
}
