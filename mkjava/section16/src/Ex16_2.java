import java.util.Scanner;

//範囲外例外
class RangeError extends RuntimeException{
	RangeError(int n){super("範囲外の値 :" + n);}	
}

//範囲外例外（仮引数）
class ParameterRangeError extends RangeError{
	ParameterRangeError(int n){super(n);}
}

//範囲外例外（返却値）
class ResultRangeError extends RangeError{
	ResultRangeError(int n){super(n);}
}

public class  Ex16_2{
	
	//nは1桁か？
	static boolean isValid(int n) {
		return n >= 0 && n <= 9;
	}
	
	//1桁整数のa,bの和を求める
	static int add(int a, int b)throws ParameterRangeError{
		if(!isValid(a)) throw new ParameterRangeError(a);
		if(!isValid(b)) throw new ParameterRangeError(b);
		int result = a + b;
		return result;
	}


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a : ");
		int a = stdIn.nextInt();
		System.out.print("整数b : ");
		int b = stdIn.nextInt();
		
		try {
			System.out.print("それらの和は" + add(a,b) + "です。");
		}catch(ParameterRangeError e) {
			System.out.println("加える数が範囲外です。" + e.getMessage());
		}
	}
}
