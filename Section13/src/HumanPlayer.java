import java.util.Scanner;

public class HumanPlayer extends Player{
	Scanner stdIn = new Scanner(System.in);
	
	public HumanPlayer(){}
	
	@Override
	public int createHand() {
		int humanHand;
		do {
			System.out.print("�����o���܂����H0...�O�[/1...�`���L/2...�p�[�F");
			humanHand = stdIn.nextInt();
		}while(humanHand<0 || humanHand>2);
		return humanHand;
	}
	
}
