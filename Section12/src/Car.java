// �����ԃN���X�y��Q�Łz

public class Car {
	private String name;			// ���O
	private int width;			// ��
	private int height;			// ����
	private int length;			// ����
	private double x;				// ���݈ʒu�w���W
	private double y;				// ���݈ʒu�x���W
	private double fuel;			// �c��R��
	private Day purchaseDay;	// �w����

	//--- �R���X�g���N�^ ---//
	public Car(String name, int width, int height, int length, double fuel,
				  Day purchaseDay) {
		this.name = name;  		this.width = width;	this.height = height;
		this.length = length;	this.fuel = fuel;		x = y = 0.0;
		this.purchaseDay = new Day(purchaseDay); 
	}

	public double getX() { return x; }			// ���݈ʒu�w���W���擾
	public double getY() { return y; }			// ���݈ʒu�x���W���擾
	public double getFuel() { return fuel; }	// �c��R�����擾
	public Day getPurchaseDay() {					// �w�������擾
		return new Day(purchaseDay);
	}

	//--- �X�y�b�N�\�� ---//
	public void putSpec() {
		System.out.println("���O�F" + name);
		System.out.println("�ԕ��F" + width  + "mm");
		System.out.println("�ԍ��F" + height + "mm");
		System.out.println("�Ԓ��F" + length + "mm");
	}

	//--- �w������dx�E�x������dy�ړ� ---//
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);		// �ړ�����

		if (dist > fuel)
			return false;				// �ړ��ł��Ȃ��@�c �R���s��
		else {
			fuel -= dist;				// �ړ������̕������R��������
			x += dx;
			y += dy;
			return true;				// �ړ�����
		}
	}
}

