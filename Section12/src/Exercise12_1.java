//�m�F�p
import java.util.Scanner;

class Exercise12_1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		CarNew car = new CarNew("name", 1, 1, 1, 1000, new Day(2020,4,1));

		car.putSpec();
		System.out.println("�w�����F" + car.getPurchaseDay());
		
		while(true) {
			System.out.println("���ݒn("+car.getX()+","+car.getY()+")�E�c��R��"+car.getFuel()+"�E���ړ�����"+car.getSumDist());
			
			System.out.print("�ړ����܂���[0�cNo/1�cYes]�F");
			if(stdIn.nextInt()==0) break;
			
			System.out.print("X�����̈ړ������F");
			double dx=stdIn.nextDouble();
			System.out.print("Y�����̈ړ������F");
			double dy=stdIn.nextDouble();
			
			
			if(!car.move(dx, dy)) System.out.println("�R��������܂���B");
		}
	}
}

