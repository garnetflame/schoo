import java.util.Scanner;

class Exercise14_2{
	public static void main(String[]args) {
		Scanner stdIn = new Scanner(System.in);
		
		RobotPet a = new RobotPet("pochi","Nick");
		
		a.introduce();
		
		System.out.print("�������Ă��炢�܂����B�i0:�|���A1:����A2:����)");
		int b = stdIn.nextInt();
		a.work(b);
		
		a.changeSkin(Skinnable.LEOPARD);
	}
}