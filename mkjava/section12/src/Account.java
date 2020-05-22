
public class Account {

	protected String name;//名義
	protected String no; //番号
	protected long balance;	//預金残高
	
	Account(String name, String no,long balance){
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	String getName() {
		return name;
	}
	
	String getNo() {
		return no;
	}
	
	long getBalance() {
		return balance;
	}
	

	//k円預ける
	void deposit(long k) {
		balance += k;
	}
	
	//k円おろす
	void withdraw(long k) {
		balance -= k;
	}
}
