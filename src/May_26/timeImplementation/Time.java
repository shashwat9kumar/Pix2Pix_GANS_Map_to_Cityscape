package May_26.timeImplementation;

public class Time {
	
	private double seconds = 0;  
	private double minutes = 0;
	private double hours = 0;
	
	public Time(){}
	
	public Time(double seconds, double minutes, double hours){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public Time add (Time obj) {
		this.seconds = this.seconds + obj.seconds;
		double carryover = this.seconds / 60;
		this.seconds = this.seconds % 60;

		
		this.minutes = this.minutes + obj.minutes + carryover;
		carryover = this.minutes / 60;
		this.minutes = this.minutes % 60;
		
		this.hours = this.hours + obj.hours + carryover;
		return this;
		
	}
	
	public void show() {
		System.out.println("Hours:\t\t " + this.hours);
		System.out.println("Minutes:\t " + this.minutes);
		System.out.println("Seconds:\t " + this.seconds);
	}
	
	
	public static void main(String args[]) throws Exception {
		Time time1 = new Time (17,45, 1);
		Time time2 = new Time (56, 4, 5);
		
		Time added = time1.add(time2);
		
		added.show();
	}
}
