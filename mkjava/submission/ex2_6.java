//�Q�̎����l��ǂݍ���ŎO�p�`�̖ʐς��v�Z
import java.util.Scanner;

class ex2_6{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�O�p�`�̖ʐς����߂܂��B");
		
		System.out.print("��� : "); //��ӂ̒l�̓��͂𑣂�
		double x = stdIn.nextDouble(); //x�Ɏ����l��ǂݍ���
		
		System.out.print("���� : "); //�����̒l�̓��͂𑣂�
		double y = stdIn.nextDouble(); //y�Ɏ����l��ǂݍ���
		
		System.out.println("�ʐς�" + (x * y/2)  + "�ł��B");
	}
}		