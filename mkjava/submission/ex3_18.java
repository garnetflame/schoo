import java.util.Scanner;

class ex3_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("月 : ");
		int a = stdIn.nextInt();
		
		switch(a){
			case 1 : 
			case 2 :
			case 12 : System.out.println("冬です。");
					break;
			case 3 :
			case 4 :
			case 5 : System.out.println("春です。");
					break;
			case 6 :
			case 7 :
			case 8 : System.out.println("夏です。");
					break;
			case 9 : 
			case 10 :
			case 11 : System.out.println("秋です。");
					break;
			default : System.out.println("検索条件に一致しません。");
					break;
			
		}
	}
}		