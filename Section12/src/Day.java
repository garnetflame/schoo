// ���t�N���XDay�y��R�Łz

public class Day {
	private int	year	= 1;		// �N
	private int	month = 1;		// ��
	private int	date 	= 1;		// ��

	//-- �R���X�g���N�^ --//
	public Day()                              { }
	public Day(int year)                      { this.year = year; }
	public Day(int year, int month)           { this(year); this.month = month; }
	public Day(int year, int month, int date) { this(year, month); this.date = date; }
	public Day(Day d)                         { this(d.year, d.month, d.date); }

	//--- �N�E���E�����擾 ---//
	public int getYear()  { return year; }		// �N���擾
	public int getMonth() { return month; }	// �����擾
	public int getDate()  { return date; }		// �����擾

	//--- �N�E���E����ݒ� ---//
	public void setYear(int year)   { this.year  = year; }	// �N��ݒ�
	public void setMonth(int month) { this.month = month; }	// ����ݒ�
	public void setDate(int date)   { this.date  = date; }	// ����ݒ�

	public void set(int year, int month, int date) {			// �N������ݒ�
		this.year  = year;			// �N	
		this.month = month;			// ��
		this.date  = date;			// ��
	}

	//--- �j�������߂� ---//
	public int dayOfWeek() {
		int y = year;					// 0 �c ���j��
		int m = month;					// 1 �c ���j��
		if (m == 1 || m == 2) {		//�@ �F
			y--;							// 5 �c ���j��
			m += 12;						// 6 �c �y�j��
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	//--- ���td�Ɠ������� ---//
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	//--- ������\����ԋp ---//
	public String toString() {
		String[] wd = {"��", "��", "��", "��", "��", "��", "�y"};
		return String.format("%04d�N%02d��%02d��(%s)", 
										year, month, date, wd[dayOfWeek()]);
	}
}

