import java.util.Scanner;

class Exercise3_15{
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
			System.out.println("��̒l�͓����ŁA���̒l��"+a+"�ł��B");
		}else{
			System.out.println("A>=B�ƂȂ�悤�Ƀ\�[�g���܂����B");
			System.out.println("A�̒l�́F"+a+"\nB�̒l�́F"+b);
			}
			
		
	}
}