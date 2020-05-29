package Arithmetic_GeneratorHW;
import java.util.ArrayList;
import java.util.List;

public class Overseer {
	
    //INSTANCE VARIABLES
	private Window _w;
	private int numQuestions;
	private int correctAnswers;
	private List<Question> questionList  = new ArrayList<Question>();
	
	//CONSTRUCTOR	
	public Overseer (){
		numQuestions = 0;
		correctAnswers = 0;
		_w = new Window();
	}
	
	/*
	 * This method sets up the quiz that is shown to the user. It allows
	 * the user to chose the number of questions they want and then sets the text to
	 * match the questions. It also allows the user to leave the program if they
	 * enter "exit" and tells the user if they answered correctly or incorrectly.
	 * Finally, it gives the user the percentage of questions the got correct. 
	 */
	public void giveQuiz(){
		while (numQuestions <= 0) {
			String input1 = _w.findUserInput("How many questions would you like to answer?", "Welcome. Note: type in 'exit' to exit the app (Case sensitive).");
			if(input1.equals("exit")){
				return;
			}
			try {
				numQuestions = Integer.parseInt(input1);
			} catch (NumberFormatException e){
				numQuestions = 0;
				_w.msg("Please enter a number solution. Note: to leave the app, type in 'exit'. ");
			}
		}
		
		for(int i = 0; i < numQuestions; i++){
			questionList.add(new Question());
		}
		
		for(int i2 = 0; i2 < numQuestions; i2++){
			String text = questionList.get(i2).getDescription() + " = ";
			String title = "Problem number: " + (i2 + 1);
			int theAnswer =-1;
			
			while(theAnswer<0){
				String input = _w.findUserInput(text, title);
				if(input.equals("exit")){
					return;
				}
				try {
					theAnswer = Integer.parseInt(input);
				} catch (NumberFormatException e){
					theAnswer = -1;
					_w.msg("Please enter a number solution. Note: to exit type in 'exit'.");
				}
			}
			if(questionList.get(i2).checkAns(theAnswer)){
				_w.msg("Correct!");
				correctAnswers++;
			}
			else{
				_w.msg("Wrong! The correct answer is: " + questionList.get(i2).getCorrectAnswer());
			}
		}
		_w.msg((int)((double)correctAnswers/(double)numQuestions*100.0) + "%" + "   We hope to see you again soon!");
	}
	
}
	
	
	
	
	
	
