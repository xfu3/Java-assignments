package assignment08;

import static org.junit.Assert.*;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import org.junit.Test;

public class Question4Test {

	@Test
	public void testTri() {
		ArrayList<Point2D.Double> pointsList1=  new ArrayList<>();
	    Point2D.Double p1 = new Point2D.Double(0.0,0.0);
	    Point2D.Double p2 = new Point2D.Double(2.0, 0.0);
	    Point2D.Double p3 = new Point2D.Double(0.0,2.0);
	    	    
	    
	    pointsList1.add(p1);
	    pointsList1.add(p2);
	    pointsList1.add(p3);
	   
	    
	    assertEquals(2.0,Question4.getArea(pointsList1),0.000000001);
	}    
    
	@Test
    public void testHex(){
    	ArrayList<Point2D.Double> pointsList2=  new ArrayList<>();
	    Point2D.Double h1 = new Point2D.Double(2.0,Math.sqrt(2));
	    Point2D.Double h2 = new Point2D.Double(4.0, 0.0);
	    Point2D.Double h3 = new Point2D.Double(-2,Math.sqrt(2));
	    Point2D.Double h4 = new Point2D.Double(-4.0, 0.0);
	    Point2D.Double h5 = new Point2D.Double(-2,-1*Math.sqrt(2));
	    Point2D.Double h6 = new Point2D.Double(2, -1*Math.sqrt(2));
	    
	    pointsList2.add(h1);
	    pointsList2.add(h2);
	    pointsList2.add(h3);
	    pointsList2.add(h4);
	    pointsList2.add(h5);
	    pointsList2.add(h6);
	
	    assertEquals(12*Math.sqrt(3),Question4.getArea(pointsList2),0.0000001);
	}
	
	@Test
    public void test(){
    	ArrayList<Point2D.Double> pointsList2=  new ArrayList<>();
	    Point2D.Double h1 = new Point2D.Double(2.0,0);
	    Point2D.Double h2 = new Point2D.Double(0.0, 2.0);
	    Point2D.Double h3 = new Point2D.Double(0.0,0.0);
	    Point2D.Double h4 = new Point2D.Double(2.0, 2.0);
	    
	    pointsList2.add(h1);
	    pointsList2.add(h2);
	    pointsList2.add(h3);
	    pointsList2.add(h4);
	    
	
	    assertEquals(4,Question4.getArea(pointsList2),0.0000001);
	}
	
	
	
	
	
	
	}


