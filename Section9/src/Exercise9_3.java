


// ��s�����N���X�y��Q�Łz���e�X�g����N���X
class Exercise9_3 {

	public static void main(String[] args) {
		
		Day o_day = new Day(2020,1,1);
		// �����N�̌���
		Account adachi = new Account("�����K��", "123456", 1000,o_day);
		

		adachi.withdraw(200);					// �����N��200�~���낷
		
		System.out.println("�������N�̌���");
		System.out.println("�@�������`�F" + adachi.getName());
		System.out.println("�@�����ԍ��F" + adachi.getNo());
		System.out.println("�@�a���c���F" + adachi.getBalance());
		System.out.println(adachi.toString());
		
	}
}
