/**
 * 
 * @author Shashwat Kumar
 * @category Foxmula Internship
 * 
 */

package May_26.shapes;

public class CallShapes {

	public static void main(String[] args) {
		Parallelogram p = new Parallelogram(0, 0, 2, 0, 3, 1, 1, 1);
		Trapezoid t = new Trapezoid(0, 0, 5, 0, 4, 4, 1, 4);
		Rectange r = new Rectange(0, 0, 4, 0, 4, 2, 0, 2);
		Square s = new Square(0, 0, 2, 0, 2 ,2, 0, 2);
		
		System.out.println("Area of Square : " + s.area());
		System.out.println("Area of Rectange : " + r.area());
		System.out.println("Area of Parallelogram : " + p.area());
		System.out.println("Area of Trapezoid : " + t.area());
	}

}
