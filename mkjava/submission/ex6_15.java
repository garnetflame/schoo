import java.util.Random;
import java.util.Scanner;

class ex6_15 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] dayString = { "sunday" ,"monday" ,"tuesday" ,"wednesday","thursday","friday","saturday"};
		String[] aString = { "��" ,"��" ,"��" ,"��","��","��","�y"};
		
		int retry = 1;
		String x;
		int day;
		int t = 20;
		int y = 0;
		int flag = 0;
		
	

		do{
			if(flag == 0){
				do{
					y = rand.nextInt(7); //�o�肳��錎�̐����F0�`11�̗���
				}while(t == y);
			}
			System.out.print(aString[y] + "�j�� : ");
			x = stdIn.next();
		
			if(dayString[y].equals(x)){
				System.out.print("�����ł��B");
				System.out.print("������x�H 1�cYes / 0�cNO :");
				retry = stdIn.nextInt();
				if(retry == 1){
				t = y;
				flag = 0;
				continue;
			}else if(retry == 0)break;
			}else{
				System.out.println("�Ⴂ�܂��B");
				flag = 1;
			}
		}while(retry == 1);
		
		System.out.println("�����l�ł���");
	}	
}		