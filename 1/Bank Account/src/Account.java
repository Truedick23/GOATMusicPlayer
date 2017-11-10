
public class Account {
	Account(String AccountName, String Name, Date OpenDate, String id) {
		accountName = AccountName;
		name = Name;
		openDate = OpenDate;
		ID = id;
	}
	private Date openDate;
	private String name;
	private String ID;
	private String accountName;
	private double totalMoney;
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String AccountName) {
		accountName = AccountName;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		name = Name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getAmount() {
		return totalMoney;
	}
	public boolean withdrawl(double amount) {
		if(amount >= totalMoney) {
			totalMoney -= amount;
			return true;
		}
		else return false;
	}
	public boolean deposit(double amount) {
		totalMoney += amount;
		return true;
	}
	public void showInfo() {
		System.out.println("Account Name: " + accountName);
		System.out.println("Owner Name: " + name);
		System.out.println("Open Date: ");
		openDate.print();
		System.out.println("Card ID: " + ID);
	}
}
