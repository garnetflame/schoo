//����

import java.util.Random;
import java.util.Scanner;

class ex4_27 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);	//0�ȏ�100�����̗���	
		int limit = rand.nextInt(10) + 1; //������1�`10�܂�
		
		System.out.println("�����ăQ�[���J�n!! ");
		System.out.println("0�`99�̐��𓖂ĂĂ��������B ");
		System.out.println("�����񐔂�"+ limit + "�ł��B");
		
		int x; //�v���C���[������
		int t = 0;
		do {
			System.out.print("�������� : ");
			x = stdIn.nextInt();
			
			t++;
			if(t >= limit) break ;
			
			if(x > no){
				System.out.println("�����Ə����Ȑ�����B");
			}else if (x < no){
				System.out.print("�����Ƒ傫�Ȑ�����B");
			}
		} while (x != no);
		
		if(t >= limit){
			System.out.println("�����񐔂𒴂��܂����B������" + no + "�ł��B");
		}else{	
			System.out.println("�����ł��B");
		}	
	}
}		
		