import java.util.Scanner;

class ex4_26 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("���������Z���܂��B");
		System.out.println("���̐������������ς����߂܂��B");
		System.out.print("�����Z���܂��� : ");
		
		int n = stdIn.nextInt();
		
		int x = 0;
		double sum = 0;
		double average = 0;
		for(int i = 1; i <= n; i++){
			System.out.print("���� : ");
			int t = stdIn.nextInt();
			if(t < 0){
				System.out.println("���̐��͉��Z����܂���B");
				++x;
				continue;
			}
			sum += t;
		}	
		if(n != x)
			average = sum / (n - x);
			System.out.println("���v��" + sum + "�ł��B");	
			System.out.println("���ς�" + average + "�ł��B");
	}	
}		