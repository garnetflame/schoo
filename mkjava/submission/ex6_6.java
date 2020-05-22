import java.util.Scanner;

class ex6_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("人数  : ");
		int n = stdIn.nextInt();
		
		int[] tensu =new int[n];
		
		System.out.println(n + "人の点数を入力せよ。");
		for(int i = 0; i < n ; i++){
			System.out.print((i + 1) + "番の点数 :");
			tensu[i] = stdIn.nextInt();
		}
		int max = tensu[0];
		int min = tensu[0];
		int sum = 0;
		double ave = 0;
		for(int i = 1 ; i < tensu.length; i++){
		sum += tensu[i];
		if(tensu[i] > max) max = tensu[i];
		if(tensu[i] < min) min = tensu[i];
		}
		ave = (double)sum / n;
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
		System.out.println("平均点は" + ave + "点です。");
	}
}		