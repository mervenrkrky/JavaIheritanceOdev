package odev;

public class userManager {

	public void login(User user1) {
		System.out.println(user1.getFirstName() +" "+ user1.getLastName() + " kodlama io sitesine giriþ yaptý.");
		
	}
	public void startMultiple(User[] users) {
		for(User user1:users)
			login(user1);
		
	}
	
}
