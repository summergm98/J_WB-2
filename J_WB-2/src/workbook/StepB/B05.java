package workbook.StepB;

import java.util.Scanner;

public class B05 {
	private int days, seconds;
	private int m_count;
	
	public B05() {
		input();
	}
	
	void printResult() {
		System.out.printf("�� ���� �ش�Ǵ� �Ⱓ�� ��� %d ���Դϴ�\n", getSeconds());
		
		m_count = 0;
		if(m_count != 0)
			System.out.printf("100�ʰ� ��� %d�� ���Ե˴ϴ�\n", getCounts());
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�� ���� �Է��ϼ���: ");
		this.days = s.nextInt();
	}
	
	int getSeconds() {
		seconds = days * 24 * 60 * 60;
		return seconds;
	}
	
	int getCounts() {
		m_count = seconds / 1000000;
		return m_count;
	}
}

