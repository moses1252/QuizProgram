package quiz_code;

public class Question {
	//data fields
	String question;
	String answer;
	
	//default constructor
	public Question() {
		question = "";
		answer = "";
	}
	
	//constructor
	public Question(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public boolean grade(String userAns) {
		return (answer.equals(userAns));
	}
	
	

}
