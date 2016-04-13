package assignment08;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Question4 {
public static double getArea(ArrayList<Point2D.Double>points){
	Point2D.Double	p = points.get(0);
	Point2D.Double	q = points.get(points.size()-2);
	Point2D.Double	r = points.get(points.size()-1);
	if(points.size() >3 ){
		double valueNow = Math.abs(p.x*q.y + q.x*r.y + r.x*p.y - p.y*q.x - q.y*r.x - r.y*p.x)/2;
		points.remove(points.size()-1);
		return valueNow + getArea(points);
	}else if(points.size() == 3){
		return Math.abs(p.x*q.y + q.x*r.y + r.x*p.y - p.y*q.x - q.y*r.x - r.y*p.x)/2;
	}else{
		return 0;
	}

}
}
