import java.util.Scanner;

public class Exercise13_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner stdIn = new Scanner(System.in);
		
		HumanPlayer a = new HumanPlayer();
		ComputerPlayer b = new ComputerPlayer();
		
		System.out.println("����񂯂�����܂��B");
		int flg=0;
		while(true) {
			
			System.out.println();
			
			if(flg==0) {
				System.out.println("�ŏ��̓O�[�A����񂯂�c");
			}else {
				System.out.println("�������Łc");
			}
			
			int humanHand = a.createHand();
			int computerHand = b.createHand();
			
			System.out.print("���Ȃ��F");
			if(humanHand==0) {
				System.out.println("�O�[");
			}else if(humanHand==1) {
				System.out.println("�`���L");
			}else if(humanHand==2) {
				System.out.println("�p�[");
			}
			
			System.out.print("�R���s���[�^�F");
			if(computerHand==0) {
				System.out.println("�O�[");
			}else if(computerHand==1) {
				System.out.println("�`���L");
			}else if(computerHand==2) {
				System.out.println("�p�[");
			}
			
			if((humanHand==0 && computerHand==1) || (humanHand==1 && computerHand==2) || (humanHand==2 && computerHand==0)) {
				System.out.println("���Ȃ��̏����ł��I");
				System.out.print("������x�s���܂����H1...Yes/2...No�F");
				int retry = stdIn.nextInt();
				if(retry==1) {
					flg=0;
					continue;
				}else {
					break;
				}
			}else if((humanHand==0 && computerHand==2) || (humanHand==1 && computerHand==0) || (humanHand==2 && computerHand==1)) {
				System.out.println("���Ȃ��̕����ł��c");
				System.out.print("������x�s���܂����H1...Yes/2...No�F");
				int retry = stdIn.nextInt();
				if(retry==1) {
					flg=0;
					continue;
				}else {
					break;
				}
			}else {
				flg=1;
			}
		}

	}

}
