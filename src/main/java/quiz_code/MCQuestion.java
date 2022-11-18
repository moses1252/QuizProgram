package quiz_code;

import java.util.ArrayList;

public class MCQuestion extends Question{
	//data fields
	
	private ArrayList<String> choices;
	private  char choiceTracker = 'a';
	
	
	public MCQuestion(String question) {
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
	
	@Override
	public String toString() {
		String result = super.getQuestion();
		char letter = 'a';
		for (int i = 0; i < choices.size(); i++) {
			result += "\n" + letter + ".\t" + choices.get(i);
			letter++;
		}
		return result;
	}
	
	
}
