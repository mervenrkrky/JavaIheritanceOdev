package odev;

public class Main {

	public static void main(String[] args) {
	    System.out.println("USERMANAGER KULLANIMI:");
		
		User egitmen =new User();
		egitmen.setFirstName("Engin");
		egitmen.setLastName("Demirog");
		
		User �grenci = new User();
		�grenci.setFirstName("Mervenur");
		�grenci.setLastName("Karakaya");
		
		
		User[] users = {egitmen,�grenci};
		userManager usermanager= new userManager();
		usermanager.startMultiple(users);
		
		System.out.println("INSTRUCTORMANAGER KULLANIMI:");
		Instructor ders = new Instructor();
		ders.setlessons("JAVA+REACT");
		ders.setFirstName("Engin");
		ders.setLastName("Demirog");
		
		instructorManager instructormanager=new instructorManager();
		instructormanager.start(ders);
		
		System.out.println("STUDENTMANAGER KULLANIMI:");
		Student y�zde = new Student();
		y�zde.setparticipationRate(38.00);
		y�zde.setId(554);
	
		
		
		studentManager studentmanager=new studentManager();
		studentmanager.look(y�zde);
		
		
		
		
		
		
		
		
		

	}

}
