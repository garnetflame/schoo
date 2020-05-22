import java.util.Scanner;
public class Ex16_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("sw : ");
		int sw =stdIn.nextInt();
		
		try {
			test(sw);	
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}catch (Error e) {
			System.out.println(e.getMessage());
	}
	}
	
	public static void test (int sw)throws Exception,Error{
		check(sw);
	}
	
	
	public static void check(int sw) throws Exception,Error{
		switch(sw) {
		case 1: throw new Exception("検査例外発生");
		case 2: throw new RuntimeException("非検査例外発生");
		case 3: throw new Error("プログラムは回復できません");
		}
	}
}
