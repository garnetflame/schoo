import java.util.Scanner;

class Exercise3_14{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("����A�F");
		int a=stdIn.nextInt();
		
		System.out.print("����B�F");
		int b=stdIn.nextInt();
		
		if (a<b){
			int t=a;
			a=b;
			b=t;
		}
		
		if (a==b){
			System.out.println("��̒l�͓����ł��B");
		}else{
				System.out.println("�������ق��̒l��"+b+"\n�傫���ق��̒l��"+a+"�ł��B");
			}
			
		
	}
}