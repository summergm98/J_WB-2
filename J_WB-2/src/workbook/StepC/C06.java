package workbook.StepC;

import java.util.Scanner;

public class C06 {
	private int kor, eng, math;
	private int total;
	private double average;
	
	public C06() {
		input();
	}
	
	public void printResult() {
		System.out.printf("�Է��Ͻ� ������ ������ %d �̰�,\n", cmpTotal());
		System.out.printf("����� %.1f �Դϴ�.\n", cmpAverage());
		
		if(cmpAverage() >= 90)
			System.out.println("���Դϴ�");
		else if(cmpAverage() >= 80 && cmpAverage() < 90)
			System.out.println("���Դϴ�");
		else if(cmpAverage() >= 70 && cmpAverage() < 80)
			System.out.println("���Դϴ�");
		else if(cmpAverage() >= 60 && cmpAverage() < 70)
			System.out.println("���Դϴ�");
		else if(cmpAverage() < 60)
			System.out.println("���Դϴ�");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���: ");
		this.kor = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		this.eng = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		this.math = s.nextInt();
	}
	
	int cmpTotal() {
		total = kor + eng + math;
		return total;
	}
	
	double cmpAverage() {
		average = (double) total / 3;
		return average; 
	}
}
