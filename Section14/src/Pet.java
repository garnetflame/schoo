class Pet {
	private String name;				// �y�b�g�̖��O
	private String masterName;		// ������̖��O

	// �R���X�g���N�^
	public Pet(String name, String masterName) {
		this.name = name;						// �y�b�g�̖��O
		this.masterName = masterName;		// ������̖��O
	}

	// �y�b�g�̖��O�𒲂ׂ�
	public String getName() { return name; }

	// ������̖��O�𒲂ׂ�
	public String getMasterName() { return masterName; }

	// ���ȏЉ�
	public void introduce() {
		System.out.println("���l�̖��O��" + name + "�ł��I"); 
		System.out.println("������l�l��" + masterName + "�ł��I");
	}
}

