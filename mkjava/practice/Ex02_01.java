import java.util.ArrayList;
import java.util.Scanner;
public class Ex02_01 {

	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Double> a = new ArrayList<>();
		double sum = 0;
		
		for(int i = 0; true ; i++) {	
		double n = stdIn.nextDouble();
		a.add(n);
		System.out.println(i+"個目の要素 : "+a.get(i) );
		sum +=a.get(i);
		if(sum>1000) {
			System.out.println("入力合計が1000を超えました。");
			System.out.println("線形探索に移ります。");
			break;
		}	
		}
		System.out.print("探す値 : ");
		double key = stdIn.nextDouble();
		
		for(int i = a.size() - 1; i >= 0 ; i--) {	
			if(a.get(i) == key) {
				break;
			}
		if(i >= 0 && i < a.size()) {
			System.out.println("それは"+ (i-1) +"にあります。");
		}else {
			System.out.println("それはありません");
		}
			
		}
		
	}
}
