package gitDemo;

public class GitDemo {

	//usinf for each loop
	public static void CapitalizeFirstLetterUsingForLoop() {
		// TODO Auto-generated method stub
		String str = "this is java code to capitalized first letter ";
		// String str1=str.substring(0,1).toUpperCase()+str.substring(1);

		String words[] = str.split("\\s");
		String capitalizedString = "";

		for (String s1 : words) {
			// Capitalize first ler 
			String firstLetter = s1.substring(0, 1);
			// Get remaining letter
			String remainingLetters = s1.substring(1);
			capitalizedString += firstLetter.toUpperCase() + remainingLetters + " ";

		}

		System.out.println(capitalizedString);

	}

	
	public static void main(String[] args) {

		CapitalizeFirstLetterUsingForLoop();

	}

}
