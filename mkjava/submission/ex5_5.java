import java.util.Scanner;

class ex5_5{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("3�̐��������v���܂��B");
		System.out.println("3�̐����̕��ς����߂܂��B");
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		System.out.print("���� c : ");
		int c = stdIn.nextInt();
		
		int sum = a + b + c;
		double average =(double)sum / 3;
		System.out.println("���v��" + sum + "�ł��B");
		System.out.println("���ς�" + average + "�ł��B");
	}	
}		