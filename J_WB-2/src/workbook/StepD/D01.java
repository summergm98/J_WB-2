package workbook.StepD;

import java.util.Scanner;

public class D01 {
	private int number;
	private int totalSum;
	private int i;
	
	public D01() {
		input();
	}
	
	public void printSum() {
		System.out.printf("1���� �Է��� ���ڱ����� ��� ������ ���� ���� %d �Դϴ�\n", getSum());
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���ڸ� �Է��ϼ���: ");
		this.number = s.nextInt();
	}
	
	int getSum() {
		
		for(i = 0; i <= number; i++)
			totalSum += i;
		
		return totalSum;
	}
}
