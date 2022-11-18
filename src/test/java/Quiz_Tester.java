import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import quiz_code.FiBQuestion;
import quiz_code.MCQuestion;
import quiz_code.Quiz;

public class Quiz_Tester {
	
	Quiz quiz = new Quiz();
	
	MCQuestion q1 = new MCQuestion("What season does Christmas take Place?");
	FiBQuestion q2 = new FiBQuestion("HTML stands for _HyperText Markup Language_ but it is not a programming language?");
	MCQuestion q3 = new MCQuestion("What color is the sun?");
	
	//test if getting 100% on a test works
	@Test
	public void gradeTestWhenAllAnsCorrect() {
		//make 1 multiple choice question and store answer
		q1.addAns("fall", false);
		q1.addAns("winter", true);
		q1.addAns("summer", false);
		q1.addAns("spring", false);
		
		quiz.addQuestion(q1);
		quiz.addQuestion(q2);
		
		quiz.storeAns('b');
		quiz.storeAns("HyperText Markup Language");
		
		String testing = quiz.gradeQuiz();
		//String testing = "100%";
		String expected = "100%";
		
		//this should run without failure trace
		assertEquals(testing, expected);
	}
	
	//test if getting 50% on a test works
	@Test
	public void gradeTestWhenHalfAnsCorrect() {
		//make 1 multiple choice question and store answer
		q1.addAns("fall", false);
		q1.addAns("winter", true);
		q1.addAns("summer", false);
		q1.addAns("spring", false);
		
		quiz.addQuestion(q1);
		quiz.addQuestion(q2);
		
		quiz.storeAns('b');
		quiz.storeAns("wrongAns");
		
		String testing = quiz.gradeQuiz();
		String expected = "50%";
		
		//this should run without failure trace
		assertEquals(testing, expected);
	}
	
	//test if getting 50% on a test works
	@Test
	public void gradeImproperFractionAns() {
		//make 2 different multiple choice questions and store answer
		q1.addAns("fall", false);
		q1.addAns("winter", true);
		q1.addAns("summer", false);
		q1.addAns("spring", false);
		
		q3.addAns("blue", false);
		q3.addAns("red", false);
		q3.addAns("yellow", true);
		q3.addAns("green", false);
		
		quiz.addQuestion(q1);
		quiz.addQuestion(q2);
		quiz.addQuestion(q3);
		
		quiz.storeAns('b');
		quiz.storeAns("HyperText Markup Language");
		quiz.storeAns('d');
		
		String testing = quiz.gradeQuiz();
		String expected = "66%";
		
		//test
		//this should run without failure trace
		assertEquals(testing, expected);
	}
	
	
	
	
	
	

}
