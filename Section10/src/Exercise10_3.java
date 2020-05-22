class MinMax{
	
	//Min
	public static int Min2(int a,int b) {
		if(a>b) return b;
		else return a;
	}
	
	public static int Min3(int a,int b,int c) {
		int min=a;
		if(b<min) min=b;
		if(c<min) min=c;
		return min;
	}
	
	public static int MinArray(int[] a) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) min=a[i];
		}
		return min;
	}
	
	//Max
	public static int Max2(int a,int b) {
		if(a<b) return b;
		else return a;
	}
	
	public static int Max3(int a,int b,int c) {
		int max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		return max;
	}
	
	public static int MaxArray(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) max=a[i];
		}
		return max;
	}
}


class Exercise10_3{
	public static void main(String[]args) {
		
		int a=1;
		int b=2;
		int c=3;
		int[] x = {5,6,7,8,9,12,10};
		System.out.println("a,b�̍ŏ��l�F"+MinMax.Min2(a,b));
		System.out.println("a,b,c�̍ŏ��l�F"+MinMax.Min3(a,b,c));
		System.out.println("�z�񂘂̍ŏ��l�i{5,6,7,8,9,12,10}�j�F"+MinMax.MinArray(x));
		System.out.println("a,b�̍ő�l�F"+MinMax.Max2(a,b));
		System.out.println("a,b,c�̍ő�l�F"+MinMax.Max3(a,b,c));
		System.out.println("�z��x�̍ő�l�i{5,6,7,8,9,12,10}�j�F"+MinMax.MaxArray(x));
	}
}