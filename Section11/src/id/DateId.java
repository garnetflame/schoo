package id;


import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class DateId {
	private static int counter;	// ���Ԃ܂ł̎��ʔԍ���^������

	private int id;					// ���ʔԍ�

	static {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);			// �N
		int m = today.get(MONTH) + 1;		// ��
		int d = today.get(DATE);			// ��

		System.out.printf("������%04d�N%02d��%02d���ł��B\n", y, m, d);
		counter = y * 1000000 + m * 10000 + d * 100;
	}

	//-- �R���X�g���N�^ --//
	public DateId() {
		id = ++counter;			// ���ʔԍ�
	}

	//--- ���ʔԍ����擾 ---//
	public int getId() {
		return id;
	}
}