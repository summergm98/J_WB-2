package workbook.StepC;

import java.util.Scanner;

public class C05 {
	private int month, day;
	private int day_count;
	
	public C05() {
		input();
	}
	
	public void printResult() {
		if(month > 12 || day > 31)
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		else
			System.out.printf("�� ��¥�� 1�� �� %d��° ���� �ش��մϴ�.\n", cmpDay());
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���: ");
		this.month = s.nextInt();
		System.out.print("���� �Է��ϼ���: ");
		this.day = s.nextInt();
	}
	
	int cmpDay() {
		
		if(month == 1)
			day_count = day;
		else if(month == 2)
			day_count = 31 + day;
		else if(month == 3)
			day_count = 59 + day;
		else if(month == 4)
			day_count = 90 + day;
		else if(month == 5)
			day_count = 120 + day;
		else if(month == 6)
			day_count = 151 + day;
		else if(month == 7)
			day_count = 181 + day;
		else if(month == 8)
			day_count = 212 + day;
		else if(month == 9)
			day_count = 243 + day;
		else if(month == 10)
			day_count = 273 + day;
		else if(month == 11)
			day_count = 304 + day;
		else if(month == 12)
			day_count = 334 + day;
		
		return day_count;		
	}
}
