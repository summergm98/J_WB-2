package workbook.StepA;

import java.util.Scanner;

public class computeAverage {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public computeAverage() {
		input();
	}
	
	public void printTotal() {
		System.out.printf("�Է��Ͻ� ������ ������ %d�Դϴ�\n", getTotal());
	}
	
	public void printAverage() {
		System.out.printf("����� %.1f�Դϴ�.", getAverage());
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
		average =  total / 3;
		return average;
	}
}
