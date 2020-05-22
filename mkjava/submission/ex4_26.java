import java.util.Scanner;

class ex4_26 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("整数を加算します。");
		System.out.println("負の数を除いた平均を求めます。");
		System.out.print("何個加算しますか : ");
		
		int n = stdIn.nextInt();
		
		int x = 0;
		double sum = 0;
		double average = 0;
		for(int i = 1; i <= n; i++){
			System.out.print("整数 : ");
			int t = stdIn.nextInt();
			if(t < 0){
				System.out.println("負の数は加算されません。");
				++x;
				continue;
			}
			sum += t;
		}	
		if(n != x)
			average = sum / (n - x);
			System.out.println("合計は" + sum + "です。");	
			System.out.println("平均は" + average + "です。");
	}	
}		