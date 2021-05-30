/**
 * 
 * @author Shashwat Kumar
 * @category Foxmula Internship
 * 
 */

package May_26.shapes;

public class Quadrilateral {
	
	protected double x1,y1, x2,y2, x3,y3, x4,y4; // pairs of points (x,y) 
	
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.x4 = x4;
		this.y3 = y3;
		this.y4 = y4;
	}
	
	private double areaTriange(double x1, double y1, double x2, double y2, double x3, double y3) { // area of half triangle
		
		/*
		 * To calculate area of a triange using the discriminant formula of coordinate system for a trainge
		 * 		    | x1 x2 x3 |
		 * 	area =	| y1 y2 y3 |
		 * 		    | 1  1  1  |
		 */
		
		double area = x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2);
		area = Math.abs(area);
		area = 0.5 * area;
		return area;
	}
	
	public double area() {
		
		/*
		 * To calculate area of quadrilateral as the area of two forming traingles
		 */
		
		double area = areaTriange(x1, y1, x2, y2, x3, y3) + areaTriange(x1, y1, x3, y3, x4, y4);
		return area;
	}
}
