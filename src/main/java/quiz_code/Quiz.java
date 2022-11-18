package quiz_code;

import java.util.ArrayList;

public class Quiz {
	//data fields
	ArrayList<Question> questions = new ArrayList<Question>();
	ArrayList<String> userInput = new ArrayList<String>();

	//default contructor
	public Quiz() {
		//do nothing
	}
	
	public void addQuestion(Question question) {
		questions.add(question);
	}
	
	public void storeAns(String userInput) {
		this.userInput.add(userInput);
	}
	
	public void storeAns(char userInput) {
		String ans = "";
		ans += userInput;
		this.userInput.add(ans);
	}
	
	public String gradeQuiz() {
		double grade = 0.0;
		
		for (int i = 0; i < questions.size(); i++) {
			if (questions.get(i).getAnswer().equals(userInput.get(i))) {
				grade++;
			}
		}
		
		String result = "";
		//grade = grade / 100.0;
		if (grade == ((double) questions.size() * 1.0)) {
//			grade = grade / questions.size();
//			grade = grade / 10;
			result = "" + "100";
		} else {
			grade = Math.floor(grade);
			grade = grade / questions.size();
			result = "" + grade;
			result = result.substring(2);
			
			//if its a whole number add a zero at the end
			if (result.length() == 1) {
				result += "0";
			}
			
			//remove any numbers if string is greater than 2
			//i.e 3.33333333 , improper fraction or mixed fraction
			while (result.length() > 2) {
				String charToString = Character.toString(result.charAt(2));
				result = result.replaceFirst(charToString, "");
			}
		}
		return result + "%";
	}
	
}
