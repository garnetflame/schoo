import java.util.Scanner;

class Exercise3_10{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("����A�F");
		int a=stdIn.nextInt();
		
		System.out.print("����B�F");
		int b=stdIn.nextInt();
		
		System.out.println("�����̒l�̍���"+(a>b ? a-b:b-a)+"�ł��B");
		
	}
}