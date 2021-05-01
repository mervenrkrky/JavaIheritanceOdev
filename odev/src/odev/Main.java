package odev;

public class Main {

	public static void main(String[] args) {
	    System.out.println("USERMANAGER KULLANIMI:");
		
		User egitmen =new User();
		egitmen.setFirstName("Engin");
		egitmen.setLastName("Demirog");
		
		User ögrenci = new User();
		ögrenci.setFirstName("Mervenur");
		ögrenci.setLastName("Karakaya");
		
		
		User[] users = {egitmen,ögrenci};
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
		Student yüzde = new Student();
		yüzde.setparticipationRate(38.00);
		yüzde.setId(554);
	
		
		
		studentManager studentmanager=new studentManager();
		studentmanager.look(yüzde);
		
		
		
		
		
		
		
		
		

	}

}
