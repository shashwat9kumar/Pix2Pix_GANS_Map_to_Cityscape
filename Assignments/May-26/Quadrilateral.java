package May_26;

public class Quadrilateral {
	int x1,y1, x2,y2, x3,y3, x4,y4;
	
	Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.x4 = x4;
		this.y3 = y3;
		this.y4 = y4;
	}
	
	private double areaTriange(int x1, int y1, int x2, int y2, int x3, int y3) { // area of half triangle
		double area = x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2);
		area = Math.abs(area);
		area = 0.5 * area;
		return area;
	}
	
	public double area() {
		double area = areaTriange(x1, y1, x2, y2, x3, y3) + areaTriange(x4, y4, x2, y2, x3, y3);
		return area;
	}
}
