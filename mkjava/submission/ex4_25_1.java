import java.util.Scanner;

class ex4_25_1{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("���������Z���܂��B");
		System.out.println("���ς����߂܂��B");
		System.out.print("�����Z���܂��� : ");
		int n = stdIn.nextInt();
		
		double sum = 0;
		double average = 0;
		for(int i = 1; i <= n; i++){
			System.out.print("����(0�ŏI��) : ");
			int t = stdIn.nextInt();
			if(t == 0)break;
			sum += t;
			average = sum / i; 
		}	
			System.out.println("���v��" + sum + "�ł��B");
			System.out.println("���ς�" + average + "�ł��B");
	}	
}		