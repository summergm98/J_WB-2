package workbook.StepA;

import java.util.Scanner;

public class daysToSeconds {
	private int days;
	private int seconds;
	
	public daysToSeconds() {
		intput();
	}
	
	public void printSeconds() {
		System.out.printf("�� ���� �ش�Ǵ� �ð��� ��� %d�� �Դϴ�\n", getSeconds());
	}
	
	void intput() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�� ���� �Է��ϼ���: ");
		this.days = s.nextInt();
	}
	
	int getSeconds() {
		seconds = days * 24 * 60 * 60;
		return seconds;
	}
}
