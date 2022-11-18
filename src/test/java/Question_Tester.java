import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import quiz_code.Question;

public class Question_Tester {
	
	Question que = new Question("Is the sun yellow?", "yes");
	
	//test if grade method works
	@Test
	public void testGradeWhenCorrect() {
		String userAns = "yes";
		assertEquals(que.grade(userAns), true);
	}
	
	//test if grade method works when its supposed to be wrong
	@Test
	public void testGradeWhenfalse() {
		String userAns = "no";
		assertEquals(que.grade(userAns), false);
	}
	

}
