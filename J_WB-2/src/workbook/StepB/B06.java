package workbook.StepB;

import java.util.Scanner;

public class B06 {
	private int kor, eng, math;
	private int total;
	private double average;
	
	public B06() {
		input();
	}
	
	public void printResult() {
		System.out.printf("�Է��Ͻ� ������ ������ %d �̰�,\n" , getTotal());
		System.out.printf("����� %.1f �Դϴ�.\n", getAverage());
		
		if(kor >= 90)
			System.out.print("���� ������ ����մϴ�.\n");
		if(eng >= 90)
			System.out.print("���� ������ ����մϴ�.\n");
		if(math >= 90)
			System.out.print("���� ������ ����մϴ�.\n");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� ������ �Է��ϼ���: ");
		this.kor = s.nextInt();
		System.out.printf("���� ������ �Է��ϼ���: ");
		this.eng = s.nextInt();
		System.out.printf("���� ������ �Է��ϼ���: ");
		this.math = s.nextInt();
	}
	
	int getTotal() {
		total = kor + eng + math;
		return total;
	}
	
	double getAverage() {
		average = (double)total / 3;
		return average;
	}
}
