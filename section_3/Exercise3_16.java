import java.util.Scanner;

class Exercise3_16{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("����A�F");
		int a=stdIn.nextInt();
		
		System.out.print("����B�F");
		int b=stdIn.nextInt();
		
		System.out.print("����C�F");
		int c=stdIn.nextInt();
		
		int t;
		
		if (a>b){
			t=a;
			a=b;
			b=t;
		}
		if (b>c){
			t=b;
			b=c;
			c=t;
		}
		if (a>b){
			t=a;
			a=b;
			b=t;
		}
		
		System.out.println("A<=B<=C�ƂȂ�悤�ɂ��܂����B\nA�F"+a+"\nB�F"+b+"\nC�F"+c);
	}
}