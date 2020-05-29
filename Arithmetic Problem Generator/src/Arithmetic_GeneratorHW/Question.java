package Arithmetic_GeneratorHW;

public class Question {
	
	//INSTANCE VARIABLE
	private String description;
	private int expectedAns;

	//GETTERS
	public String getDescription(){return description;}
	public int getCorrectAnswer(){return expectedAns;}
	
	/*
	 * CONSTRUCTOR: This constructor creates a randomized question
	 * which can either be an addition or subtraction question
	 * that uses two int number, each between numbers 0 and 9 (inclusive).
	 */
	public Question() {
		
		int num1 = ((int)(Math.random() * 10));
		int operation = ((int)(Math.random() * 2));
		int num2 =  0;
		expectedAns = -1;
		
		while(expectedAns < 0){
			
			num2 = ((int)(Math.random() * 10));
			
			if(operation == 0){
				expectedAns = num1 + num2;
			}
			else{
				expectedAns = num1 - num2;
			}
		}
		if (operation == 0){
			description = num1 + " " + "+" + " " + num2;
		}
		else {
			description = num1 + " " + "-" + " " + num2;
		}
	}
	
	/*
	 * This method checks if the user's answer is correct.
	 */
	public boolean checkAns(int inputedAns){
		if(inputedAns == expectedAns){
			return true; 
		}
		else {
			return false;
		}
	}
	
}
