package assignment08;

public class Question3 {
public static double squareRootGuess(double x, double g){
	double retVal = 0.0;
	if( x<0){
		throw new IllegalArgumentException("non-negative inputs are expected");
    }else if(x>0){
       retVal = (g+x/g)/2;
       if(g*g>x+1E-9||g*g<x-1E-9){
    	   retVal = squareRootGuess(x,retVal);
        }else{
        retVal = g;
        }
    }
return retVal;
}
public static double squareRoot(double x){
	return squareRootGuess(x,x);
}



}
