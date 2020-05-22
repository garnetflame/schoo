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
					int month = rand.nextInt(12); //出題される月の数字：0～11の乱数
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
			System.out.print("月: ");
			x = stdIn.next();
		
			if(monthString[a[t]].equals(x)){
				System.out.print("正解です。");
				if(t ==11){
				System.out.println("completeです！！");
				break;
				}	
				System.out.print("もう一度？ 1…Yes / 0…NO :");
				retry = stdIn.nextInt();
				if(retry == 1){	
				t++;
				continue;
			}else if(retry == 0)break;
			}else{
				System.out.println("違います。");
			}
			}while(retry == 1 && t < 12);
		System.out.println("お疲れ様でした");
	}	
}		