package workbook.StepD;

import java.util.Scanner;

public class D03 {
	private int number;
	private int count = 0;
	private int totalsum;
	private double average;
	
	public D03() {
		getNum();
	}
	
	public void printR() {
		System.out.printf("�Է��� %d ���� ���ڵ��� �� �հ�� %d �̰�, ��� ���� %.1f �Դϴ�\n", count, totalsum, getAverage());
	}
	void getNum() {
		totalsum = 0;
		
		while(true) {
			input();
			if(number >= 0 && number <= 100) {
				count++;
				totalsum += number;
			}else {
				break;
			}
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("0���� 100 ������ ���ڸ� �Է��ϼ���:");
		this.number = s.nextInt();
	}
	
	double getAverage() {
		average = (double)totalsum / (double)count;
		return average;
	}
}
