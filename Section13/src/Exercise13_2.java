import java.util.Scanner;

public class Exercise13_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.print("�}�`�͉��F");
		int n = stdIn.nextInt();
		
		Shape[]a = new Shape[n];
		
		for(int i=0;i<n;i++) {
			int[]x = new int[n];
			System.out.print(i+1+"�Ԃ̒��p�O�p�`�̎�ށi1...����/2...����/3...�E��/4...�E���j�F");
			x[i] = stdIn.nextInt();
			System.out.print("�����F");
			int bottom = stdIn.nextInt();
			if(x[i]==1) {
				a[i]=new UpperLeft(bottom);
			}else if(x[i]==2) {
				a[i]=new LowerLeft(bottom);
			}else if(x[i]==3) {
				a[i]=new UpperRight(bottom);
			}else if(x[i]==4){
				a[i]=new LowerRight(bottom);
			}
		}
		for(int i=0;i<n;i++) {
			a[i].print();
		}
	}
}
