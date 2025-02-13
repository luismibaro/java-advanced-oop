package first_Cheched_exceptions_in_action;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {
	int firstNumber;
	int secondNumber;
	
	int add() {
		return firstNumber + secondNumber;
	}

	// Handling Checked Exceptions
	// First: adding the exception to the method signature
	/*
	void readNumbersFromFile() throws FileNotFoundException {
		Scanner fileScanner = new Scanner(new File("src/numbers.txt"));
		int firstNumber = fileScanner.nextInt();
		int secondNumber = fileScanner.nextInt();
	}
	*/
	
	// Second: surrounding the code with a try-catch block
	void readNumbersFromFile() {
		try {
			Scanner fileScanner = new Scanner(new File("src/numbers.txt"));
			int firstNumber = fileScanner.nextInt();
			int secondNumber = fileScanner.nextInt();
		} catch (FileNotFoundException fileNotFoundException){
			System.err.println(fileNotFoundException.getMessage());
		}
	}
}
