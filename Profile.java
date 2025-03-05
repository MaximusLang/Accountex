import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Profile {
	private String password;
	File pw;
	public AccountsList list;
	
	public Profile(String userInput) {
		password = userInput;
		list = new AccountsList();
		System.out.println("profile object created");
	}
	
	//Creates account object and adjoining file, and adds to list of accounts
	public void createAccount(String Uname, String Uemail, int Uphone, String Upassword) {
		Account acc = new Account(Uname, Uemail, Uphone, Upassword);
		acc.createAccountFile();
		list.addAccount(acc);
		System.out.println("Account " + Uname + " added");
	}
	
	//Creates file to save passwords
	public void createPWFile() {
		pw = new File("pw.txt");
		try {
			FileWriter writer = new FileWriter("pw.txt");
			writer.write(password);
			writer.close();
			System.out.println("password written to file");
		} catch (IOException e) {
			System.out.println("you got problems bru");
			e.printStackTrace();
		}
	}

}
//3-4-25 Status: constructor, createPWFile are created. Will run for single-profile structure only.