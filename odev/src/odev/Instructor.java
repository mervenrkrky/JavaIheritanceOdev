package odev;

public class Instructor extends User{
	public String lessons;
	public Instructor() {
		
	}
	public Instructor(String lessons) {
		this.lessons=lessons;
		
	}
	public String getlessons() {
		 return lessons;
	 }
	 public void setlessons(String lessons) {
		 this.lessons= lessons;
	 }
		 
	
}
