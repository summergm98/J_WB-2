package workbook.StepD;

import java.util.Scanner;

public class D02 {
	private int number;
	private int max_num, min_num;

	public D02() {
		max_num = -1;
		min_num = 999;
		
		while(true) {
		input();
			if(number >= 0 && number <= 100) {
				checkMax();
				checkMin();
			}else {
				break;
			}
		}
	}
	
	public void printR() {
		System.out.printf("�Էµ� ���ڵ� �� ���� ū ���� %d �̰�, ���� ���� ���� %d �Դϴ� \n", max_num,min_num);
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("0���� 100 ������ ���ڸ� �Է��ϼ���:");
		this.number = s.nextInt();
	}
	
	void checkMax() {
		if(max_num < number)
			max_num = number;
	}
	
	void checkMin() {
		if(min_num > number)
			min_num = number;
	}
}
