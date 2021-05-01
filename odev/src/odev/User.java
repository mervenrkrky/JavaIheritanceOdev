package odev;

public class User {
	
	
	private String firstName;
	private String lastName;
	private String password;
	private String mail;
	private int id;
	public User() {
		
	}
	 public User(int id,String firstName,String lastName,String password,String mail) {
		 this.id= id;
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.password=password;
		 this.mail=mail;
		
	 }
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id= id;
	 }
	 public String getFirstName() {
		 return firstName;
	 }
	 public void setFirstName(String firstName) {
		 this.firstName= firstName;
	 }
	 public String getLastName() {
		 return lastName;
	 }
	 public void setLastName(String lastName) {
		 this.lastName= lastName;
	 }
	 public String getpassword() {
		 return password;
	 }
	 public void setpassword(String password) {
		 this.password= password;
	 }
	 public String getmail() {
		 return mail;
	 }
	 public void setmail(String mail) {
		 this.mail= mail;
	 }
	

}
