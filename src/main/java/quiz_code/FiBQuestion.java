package quiz_code;

public class FiBQuestion extends Question {
//	public static void main(String[] args) {
//		String testing = "HTML stands for _HyperText Markup Language_ but it is not a programming language?";
//		
//		System.out.println(parseAns(testing));
//		System.out.println(hideAns(testing));
//	}
	
	
	public FiBQuestion(String question) {
		super();
		//parse answer from question
		String answer = parseAns(question);
		
		//parse out answer from question
		String questionNoAnswer = hideAns(question);
		
		//set question and answer
		super.setQuestion(questionNoAnswer);
		super.setAnswer(answer);

	}
	
	//method to parse out answer from question
	private String parseAns(String question) {
		int leftPointer = question.indexOf('_');
		int rightPointer = question.lastIndexOf('_');
		
		String answer = question.substring(leftPointer + 1, rightPointer);
		return answer;
	}
	
	//method will hide answer from the given question
	public String hideAns(String question) {
		int leftPointer = question.indexOf('_');
		int rightPointer = question.lastIndexOf('_');
		
		String result = "";
		
		for (int i = 0; i < question.length(); i++) {
			if (i > leftPointer && i < rightPointer) {
				result += "_";
			} else {
				result += question.charAt(i);
			}
			
		}
		return result;
	}
}
