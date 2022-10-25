/**
 * Names class
 * This class contains tasks related to the use of the Strings class.
 *
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Names {

	// Task 1
	 public String upperCaseName (String name) {
		return name.toUpperCase();
	}

	// Task 2

	 public String fullName(String firstN, String lastN) {
		return firstN + " " + lastN;
	}

	// Task 3

	 public int letterCount(String name) {
		return name.length();
	}

	// Task 4
    public Boolean theSameName (String name1, String name2) {
		return name2.equalsIgnoreCase(name1);
	}

	// Task 5
	 public String properCaseName(String name ) {
		return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
	}
}
