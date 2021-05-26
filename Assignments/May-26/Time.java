package May_26;

public class Time {
	private int seconds = 0;  
	private int minutes = 0;
	private int hours = 0;
	
	public Time(){}
	
	public Time(int seconds, int minutes, int hours){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public Time add (Time obj) {
		this.seconds = this.seconds + obj.seconds;
		int carryover = this.seconds / 60;
		this.seconds = this.seconds % 60;
		
//		System.out.println("Seconds:\t " + this.seconds);
		
		this.minutes = this.minutes + obj.minutes + carryover;
		carryover = this.minutes / 60;
		this.minutes = this.minutes % 60;
//		System.out.println("Minutes:\t " + this.minutes);
		
		this.hours = this.hours + obj.hours + carryover;
//		System.out.println("Hours:\t " + this.hours);
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
