import java.util.Scanner;

class Exercise4_19{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int retry;
		int n;
		
		do{
			do{
				System.out.print("�G�߂����߂܂��B\n�����ł����F");
				n=stdIn.nextInt();
			}while(n<1 || n>12);
			if(n>=3&&n<=5){
				System.out.println("����͏t�ł��B");
			}
			if(n>=6&&n<=8){
				System.out.println("����͉Ăł��B");
			}
			if(n>=9&&n<=11){
				System.out.println("����͏H�ł��B");
			}
			if(n==12||n==1||n==2){
				System.out.println("����͓~�ł��B");
			}
			System.out.print("������x�H�@1�cYes/0�cNo");
			retry=stdIn.nextInt();
		}while (retry==1);
	}
}
