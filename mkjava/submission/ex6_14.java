import java.util.Random;
import java.util.Scanner;

class ex6_14 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = { "January" ,"February" ,"March" ,"April","May","June","July","August","September","October","November","December"};
		
		int retry = 1;
		String x;
		int month = 0;
		int t = 20;
		int flag = 0;
	

		do{
			if(flag == 0){
				do{
					month = rand.nextInt(12); //出題される月の数字：0～11の乱数
				}while(t == month);
			}		
			System.out.print(month + 1);	
			System.out.print("月: ");
			x = stdIn.next();
		
			if(monthString[month].equals(x)){
				System.out.print("正解です。");
				System.out.print("もう一度？ 1…Yes / 0…NO :");
				retry = stdIn.nextInt();
				if(retry == 1){
				t = month;
				flag = 0;
				continue;
			}else if(retry == 0)break;
			}else{
				System.out.println("違います。");
				flag = 1;	
			}
		}while(retry == 1);
		
		System.out.println("お疲れ様でした");
	}	
}		