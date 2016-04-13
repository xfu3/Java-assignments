package assignment08;

import java.util.ArrayList;

public class Question2 {

	public static int recursiveSum(ArrayList<Integer> list){
	    int retVal =0;
	    if( list !=null&&list.size()!=0){
	    	int storVal = list.get(0);
	        list.remove(0);
	        retVal= storVal+ recursiveSum(list);
	    }
	    return retVal;
	}
}
