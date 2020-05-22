import java.util.ArrayList;
import java.util.Scanner;
public class Ex02_02 {

	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		ArrayList<Double> array = inputDataUntil1000();
		System.out.print("キー値を探します : ");
		double d = stdIn.nextDouble();
		System.out.println("それは"+linearSearchR(d,array)+"にあります" );	
	}

	public static ArrayList<Double> inputDataUntil1000(){
		ArrayList<Double> array = new ArrayList<>();
		Scanner stdIn =new Scanner(System.in);
		double sum = 0;
			for(int i = 0; true ; i++) {	
			double n = stdIn.nextDouble();
			array.add(n);
			System.out.println(i+"個目の要素 : "+array.get(i) );
			sum +=array.get(i);
				if(sum>1000) {
					System.out.println("入力合計が1000を超えました。");
					System.out.println("線形探索に移ります。");
					break;
				}	
			}
		return array;
	}	
	static int linearSearchR(double d,ArrayList<Double> array) {
		for(int i = array.size()-1 ; i >= 0 ; i--) {
			if(d == array.get(i) ) {
				return i + 1;
			}
		}
		return -1;
	}
}
