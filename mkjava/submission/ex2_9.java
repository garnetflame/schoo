//����

import java.util.Random;

class ex2_9 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		double x = rand.nextDouble();    //0�ȏ�1�����̗���
		double y = rand.nextDouble()*10;   //0�ȏ�10�����̗���	
		double z = rand.nextDouble()*2 - 1;    //-1.0�`0�����̗���
		
		System.out.println("0.0�ȏ�1.0�����̎����l : " + x);
		System.out.println("0.0�ȏ�10.0�����̎����l : " + y);
		System.out.println("-1.0�ȏ�1.0�����̎����l : " + z);
	}
}		
		