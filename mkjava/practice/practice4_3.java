//�����l����͂����̐�Βl�����߂�v���O����

import java.util.Scanner;

class practice4_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("����A : ");
		int A = stdIn.nextInt();
		
		System.out.print("����B : ");
		int B = stdIn.nextInt();
		
		if(A < B){			//A��B����ёւ��AA�̕����傫������
			int t = A;
			A = B;
			B = t;
		}
		int C = B ;
		
		do{
			System.out.print(C ++ + " ");
		}while(A > C );
	}
}		