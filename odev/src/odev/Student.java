package odev;

public class Student extends User {
	private double participationRate;
	public Student() {
		
	}
	public Student(double participationRate) {
		this.participationRate=participationRate;
		
	}
	public double getparticipationRate() {
		 return participationRate;
	 }
	 public void setparticipationRate(double participationRate) {
		 this.participationRate= participationRate;
	 }
		 
}
