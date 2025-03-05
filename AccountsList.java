import java.util.ArrayList;
public class AccountsList {
	public ArrayList<Account> list;
	public AccountsList() {
		list = new ArrayList<Account>();
	}
	public void addAccount(Account acc) {
		list.add(acc);
	}
	public int size() {
		return list.size();
	}
	public Account get(int i) {
		return list.get(i);
	}
}
