//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class ex3_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("����A : ");
		int A = stdIn.nextInt();
		
		System.out.print("����B : ");
		int B = stdIn.nextInt();
		
		if(A % B == 0)
			System.out.println("B��A�̖񐔂ł��B");
		else
			System.out.println("B��A�̖񐔂ł͂���܂���B");
	}
}		