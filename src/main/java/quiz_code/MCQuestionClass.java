package quiz_code;

import java.util.ArrayList;

public class MCQuestionClass extends Question{
	//data fields
	
	private ArrayList<String> choices;
	private  char choiceTracker = 'a';
	
	
	public MCQuestionClass(String question) {
		super.setQuestion(question);
		//initialized the ArrayLIst to be empty
		choices = new ArrayList<String>();
	}
	
	public void addAns(String option, boolean answer) {
		choices.add(option);
		if (answer == true) {
			super.setAnswer(choiceTracker + "");
		}
		choiceTracker++;
	}
	
	@Overide
	
	
}
