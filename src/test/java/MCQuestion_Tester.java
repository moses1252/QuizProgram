import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import quiz_code.MCQuestion;
import quiz_code.Question;

public class MCQuestion_Tester {
	//data fields
	Question que = new Question("What color is the sun?", "yellow");
	MCQuestion choice1 = new MCQuestion(que.getQuestion());
	
	//generate possible answers
	String option1 = "blue";
	String option2 = "red";
	String option3 = "green";
	String option4 = "yellow";
	
	//check if we store the correct answer
	@Test
	public void testGradeWhenCorrect() {
		
		//store them in choice1 object
		choice1.addAns(option1, false);
		choice1.addAns(option2, false);
		choice1.addAns(option3, false);
		choice1.addAns(option4, true);
		
		//this should run without failure trace
		assertEquals(que.getAnswer(), option4);
	}
	
	//check if program detects wrong answer
	@Test
	public void testGradeWhenIncorrect() {
		
		//store them in choice1 object
		choice1.addAns(option1, false);
		choice1.addAns(option2, false);
		choice1.addAns(option3, false);
		choice1.addAns(option4, true);
		
		//this should run without failure trace
		assertNotEquals(que.getAnswer(), option1);
	}
	
	//check if to string prints properly
	@Test
	public void testToString() {
		//store them in choice1 object
		choice1.addAns(option1, false);
		choice1.addAns(option2, false);
		choice1.addAns(option3, false);
		choice1.addAns(option4, true);
		
		String testing = choice1.toString();
		String expected = "";
		
		//create expected result
		expected += "What color is the sun?\n";
		expected += "a.\tblue\nb.\tred\nc.\tgreen\nd.\tyellow";
		
		//this should run without failure trace
		assertEquals(testing, expected);
	}	
}
