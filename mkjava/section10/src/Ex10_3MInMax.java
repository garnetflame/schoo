
public final class Ex10_3MInMax {

	//2値の最小値を求める
	public static double Min2(double a, double b) {
		return a <= b ? a : b;
	}

	//3値の最小値を求める
	public static double Min3(double a, double b, double c) {
		double min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		return min;
	}
	//配列の最小値を求める
	public static double MinArray(double[] a){
		double min = 0;
		for(int i = 0 ; i < a.length; i++) {
			if(i == 0) {
			min = a[i];
			}else if(i > 0) {
				if(a[i] < min) {
					min = a[i];
				}
			}
		}
		return min;
	}
	//2値の最大値を求める
	public static double Max2(double a, double b) {
		return a >= b ? a : b;
	}

	//3値の最大値を求める
	public static double Max3(double a, double b, double c) {
		double max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		return max;
	}
	//配列の最大値を求める
	public static double MaxArray(double[] a){
		double max = 0;
		for(int i = 0 ; i < a.length; i++) {
			if(i == 0) {
			max = a[i];
			}else if(i > 0) {
				if(a[i] > max) {
					max = a[i];
				}
			}
		}
		return max;
	}
}
