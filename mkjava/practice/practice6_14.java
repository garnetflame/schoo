import java.util.Random;
import java.util.Scanner;

class practice6_14 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = { "January" ,"February" ,"March" ,"April","May","June","July","August","September","October","November","December"};
		
		int retry = 1;
		String x;
		int t = 0;
		
		int[] a =new int[12];
			for(int i = 0 ; i < 12 ; i++){
				if(i == 0){
					int month = rand.nextInt(12); //�o�肳��錎�̐����F0�`11�̗���
					a[i] = month;
				
				}else if(i > 0){
					
			roop:	
					while(true){
						int month = rand.nextInt(12);
					
						for(int j = 0 ; j < i; j++){
						
							if(month == a[j]){
								continue roop;
							}	
						}	
						a[i] = month;
						break;
					}	
				}
			}		
			do{
			System.out.print(a[t] + 1);	
			System.out.print("��: ");
			x = stdIn.next();
		
			if(monthString[a[t]].equals(x)){
				System.out.print("�����ł��B");
				if(t ==11){
				System.out.println("complete�ł��I�I");
				break;
				}	
				System.out.print("������x�H 1�cYes / 0�cNO :");
				retry = stdIn.nextInt();
				if(retry == 1){	
				t++;
				continue;
			}else if(retry == 0)break;
			}else{
				System.out.println("�Ⴂ�܂��B");
			}
			}while(retry == 1 && t < 12);
		System.out.println("�����l�ł���");
	}	
}		