import java.util.Date;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Account {
	
	//Account Info
	public String name;
	public String email;
	public int phone;
	private String password;
	public Date DateCreated;
	File file;
	
	//Constructor
	public Account(String Uname, String Uemail, int Uphone, String Upassword) {
		name = Uname;
		email = Uemail;
		phone = Uphone;
		password = Upassword;
		DateCreated = new Date();
	}
	
	//checks if name has been created for each account
	public boolean nameIsNull() {
		if (name == null)
			return true;
		return false;
	}
	
	//UTILIZE WHEN ENCAPSULATING PASSWORD
	/*public String getPassword() {
		return password; 
	}
	*/
	
	@Override
	public String toString() {
		return "Name: " + name + "\nEmail: " + email + "\nphone" + phone + "\nPassword: " + password + "\nDate: " + DateCreated.toString();
	}
	
	//creates and writes Account
	public void createAccountFile() {
		try {
			file = new File(name + ".txt"); //may need to change based on accountNames
			FileWriter writer = new FileWriter(file);
			writer.write(this.toString()); //may need to change the output to file to be more minimal for easy reading. 
			writer.close();
		}
		catch (IOException e) {
			System.out.println("Error w/ Account file creation or writing");
			e.printStackTrace();
		}
	}
	
	

	//
	
}
