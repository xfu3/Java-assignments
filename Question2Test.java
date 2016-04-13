package assignment08;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

public class Question2Test {

	@Test
	public void test() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random r = new Random(); // this is java.util.Random
		int count = 0;
		for(int i = 0; i < 100; i++) {
			int j = r.nextInt(1000);
			list.add(j);
			count += j;
		}
		assertEquals(count,Question2.recursiveSum(list));
	}
       
    @Test
    public void test1(){
    	ArrayList<Integer>list1 = null;
        int count = 0;
        assertEquals(count,Question2.recursiveSum(list1));
        }
    
    @Test
    public void test2(){
    	ArrayList<Integer>list2 = new ArrayList<Integer>();
        int count = 0;
        assertEquals(count, Question2.recursiveSum(list2));


}
    


}
