//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex5_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("10�i������8�i����16�i���ŕ\���܂��B");
		int x;
		do{
			System.out.print("���̐����l : ");
			x = stdIn.nextInt();
		}while(x <= 0);
		
		System.out.printf("8�i���ł�x = %o�ł��B\n", x);
		System.out.printf("16�i���ł�x = %x�ł��B\n", x);
		
	}
}		