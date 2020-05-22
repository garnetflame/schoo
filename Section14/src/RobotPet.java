class RobotPet extends Pet implements Skinnable{
	
	// �R���X�g���N�^
	public RobotPet(String name, String masterName) {
		super(name, masterName);		// �X�[�p�[�N���X�̃R���X�g���N�^
	}

	// ���ȏЉ�
	public void introduce() {
		System.out.println("�����̓��{�b�g�B���O��" + getName() + "�B"); 
		System.out.println("������l�l��" + getMasterName() + "�B");
	}

	// �Ǝ�������
	public void work(int sw) {
		switch (sw) {
		 case 0: System.out.println("�|�����܂��B"); break;
		 case 1: System.out.println("���󂵂܂��B"); break;
		 case 2: System.out.println("�������܂��B"); break;
		}
	}
	
	public void changeSkin(int skin) {
		System.out.print("�X�L����");
		switch(skin) {
		case BLACK: System.out.println("��"); break;
		case RED: System.out.println("��"); break;
		case GREEN: System.out.println("��"); break;
		case BLUE: System.out.println("��"); break;
		case LEOPARD: System.out.println("�q���E��"); break;
		default: System.out.println("���n"); break;
		}
		System.out.println("�ɕύX���܂����B");
	}
}

