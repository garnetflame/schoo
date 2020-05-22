import java.util.Scanner;

class ex3_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("Œ : ");
		int a = stdIn.nextInt();
		
		switch(a){
			case 1 : 
			case 2 :
			case 12 : System.out.println("“~‚Å‚·B");
					break;
			case 3 :
			case 4 :
			case 5 : System.out.println("t‚Å‚·B");
					break;
			case 6 :
			case 7 :
			case 8 : System.out.println("‰Ä‚Å‚·B");
					break;
			case 9 : 
			case 10 :
			case 11 : System.out.println("H‚Å‚·B");
					break;
			default : System.out.println("ŒŸõğŒ‚Éˆê’v‚µ‚Ü‚¹‚ñB");
					break;
			
		}
	}
}		