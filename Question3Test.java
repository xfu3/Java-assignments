package assignment08;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Question3Test {

	@Test
	public void test(){
		assertEquals(Math.sqrt(0),Question3.squareRootGuess(0,3),1E-9);
	    
	}

    @Test
    public void test1(){
    	assertEquals(Math.sqrt(2),Question3.squareRootGuess(2, 4),1E-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput(){
    	Question3.squareRoot(-1.0);
    }
}
