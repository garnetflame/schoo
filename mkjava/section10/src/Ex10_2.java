import java.util.Scanner;

public class Ex10_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("識別番号の増加値(初期は1) :  ");
		int n = stdIn.nextInt();
		Ex10_2EXid a = new Ex10_2EXid();
		Ex10_2EXid b = new Ex10_2EXid();
		Ex10_2EXid c = new Ex10_2EXid();

		Ex10_2EXid.increaseN(n);
		Ex10_2EXid d = new Ex10_2EXid();
		Ex10_2EXid e = new Ex10_2EXid();
		Ex10_2EXid f = new Ex10_2EXid();

		System.out.println("aの識別番号 : " + a.getId());
		System.out.println("bの識別番号 : " + b.getId());
		System.out.println("cの識別番号 : " + c.getId());
		System.out.println("dの識別番号 : " + d.getId());
		System.out.println("eの識別番号 : " + e.getId());
		System.out.println("fの識別番号 : " + f.getId());
		//System.out.println("Ex10_1id.counter = "+ Ex10_1id.counter);
		//System.out.println("a.counter = "+ a.counter);
		//System.out.println("b.counter = "+ b.counter);
		System.out.println("最後の識別番号 : " + Ex10_2EXid.getMaxId());
	}
}