//����

import java.util.Random;

class ex2_7 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		int x = rand.nextInt(9) +1 ;
		int y = rand.nextInt(9) -9 ;    //-9�ȏ�0�����̗���
		int z = rand.nextInt(90) + 10;	//10�ȏ�100�����̗���	
		
		System.out.println("�ꌅ�̐��̐����l : " + x);
		System.out.println("�ꌅ�̕��̐����l : " + y);
		System.out.println("�񌅂̐��̐����l : " + z);
	}
}		
		