import java.util.Scanner;

class Exercise2_5{
	
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("x�̒l�F");
		double x = stdIn.nextDouble();
		
		System.out.print("y�̒l�F");
		double y = stdIn.nextDouble();
		
		System.out.println("���v�́F"+(x+y)+"�ł��B");
		System.out.print("���ς́F"+(x+y)/2+"�ł��B");
	}
}

	
	