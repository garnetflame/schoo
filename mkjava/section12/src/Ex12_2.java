import java.util.Scanner;
public class Ex12_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("aさんbさんのアカウント作成します");
		System.out.print("aさんの口座番号 : ");
		String NOa = stdIn.next();
		System.out.print("bさんの口座番号 : ");
		String NOb = stdIn.next();
		System.out.println("aさんの預金残高 : ");
		long balancea = stdIn.nextInt();
		System.out.println("bさんの預金残高 : ");
		long balanceb = stdIn.nextInt();
		System.out.println("bさんの定期預金残高 : ");
		long timebalanceb = stdIn.nextInt();

		Account a = new Account("a",NOa,balancea);
		AccountTime b = new AccountTime("b",NOb,balanceb,timebalanceb);


		System.out.println(compBalance(a,b));
	}


	public static int compBalance(Account a , Account b) {
		long x = a.getBalance();
		if(a instanceof AccountTime) {
			x += ((AccountTime)a).getTimeBalance();
		}	
		long y = b.getBalance();
		if(b instanceof AccountTime) {
			y += ((AccountTime)b).getTimeBalance();
		}	
		if(x > y) {
			return 1;
		}else if(x < y){
			return -1;
		}else {
			return 0;
		}
	}
}		

