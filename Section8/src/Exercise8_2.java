import java.util.Scanner;
import java.util.Random;

public class Exercise8_2 {

	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	
	public static void main(String[] args) {
		
		System.out.println("�Ԃ̃f�[�^����͂���B");
		System.out.print("���O�́F"); String name=stdIn.next();
		System.out.print("�ԕ��́F"); int width=stdIn.nextInt();
		System.out.print("�ԍ��́F"); int height=stdIn.nextInt();
		System.out.print("�Ԓ��́F"); int length=stdIn.nextInt(); 
		System.out.print("�d�ʂ́F"); int weight=stdIn.nextInt();
		System.out.print("�K�\�����ʂ́F"); double fuel=stdIn.nextDouble();
		System.out.print("�R��́F"); double fuelEco=stdIn.nextDouble();
		
		Car myCar=new Car(name,width,height,length,weight,fuel,fuelEco);
		
		while(true) {
			System.out.println("���ݒn("+myCar.getX()+","+myCar.getY()+")�E�c��R��"+myCar.getFuel()+"�E�V�C�F"+myCar.getWeather());
			
			System.out.print("�ړ����܂���[0�cNo/1�cYes]�F");
			if(stdIn.nextInt()==0) break;
			
			System.out.print("X�����̈ړ������F");
			double dx=stdIn.nextDouble();
			System.out.print("Y�����̈ړ������F");
			double dy=stdIn.nextDouble();
		
			if(!myCar.move(dx, dy,fuelEco)) System.out.println("�R��������܂���B");
		}
	}
}

