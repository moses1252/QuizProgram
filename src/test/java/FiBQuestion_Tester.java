import static org.junit.Assert.assertEquals;

import org.junit.Test;

import quiz_code.FiBQuestion;

public class FiBQuestion_Tester {
	
	String question = "HTML stands for _HyperText Markup Language_ but it is not a programming language";
	FiBQuestion question1 = new FiBQuestion(question);

	
	//testing my parsing method
	//this test only works when parseAns is public
//	@Test
//	public void testAnswerParser() {
//		
//		String testing = "HyperText Markup Language";
//		
//		//parseAns is a private method make it public
//		String expected = question1.parseAns(question);
//		
//		//this should run without failure trace
//		assertEquals(testing, expected);
//	}
	
	//testing my parsing method
	//this test only works when hideAns is public
//	@Test
//	public void testAnswerParser() {
//		
//		String testing = "HTML stands for ___________________________ but it is not a programming language";
//		
//		//parseAns is a private method make it public
//		String expected = question1.getQuestion();
//		
//		//this should run without failure trace
//		assertEquals(testing, expected);
//	}

}
