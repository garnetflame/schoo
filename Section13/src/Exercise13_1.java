import java.util.Scanner;

public class Exercise13_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.print("�}�`�͉��F");
		int n = stdIn.nextInt();
		
		Shape[]a = new Shape[n];
		
		for(int i=0;i<n;i++) {
			int[]x = new int[n];
			System.out.print(i+1+"�Ԃ̐}�`�̎�ށi1...�_/2...��������/3...��������/4...�����`�j�F");
			x[i] = stdIn.nextInt();
			
			if(x[i]==2) {
				System.out.print("�����F");
				int length = stdIn.nextInt();
				a[i]=new HorzLine(length);
			}else if(x[i]==3) {
				System.out.print("�����F");
				int length = stdIn.nextInt();
				a[i]=new VertLine(length);
			}else if(x[i]==4) {
				System.out.print("���F");
				int width = stdIn.nextInt();
				System.out.print("�����F");
				int height = stdIn.nextInt();
				a[i]=new Rectangle(width,height);
			}else {
				a[i]=new Point();
			}
		}
		for(int i=0;i<n;i++) {
			a[i].print();
		}
	}
}
