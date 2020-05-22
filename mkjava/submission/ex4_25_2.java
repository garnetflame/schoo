import java.util.Scanner;

class ex4_25_2{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("整数を加算します。");
		System.out.println("平均を求めます。");
		System.out.print("何個加算しますか : ");
		int n = stdIn.nextInt();
		
		double sum = 0;
		double average = 0;
		for(int i = 1; i <= n; i++){
			System.out.print("整数 : "); 
			int t = stdIn.nextInt();
			if(sum + t > 1000){
				System.out.println("合計が1000超えました。");
				System.out.println("最後の値は無視します。");
				break;
			}	
			sum += t;
			average = sum / i; 
		}	
			System.out.println("合計は" + sum + "です。");
			System.out.println("平均は" + average + "です。");
	}	
}		