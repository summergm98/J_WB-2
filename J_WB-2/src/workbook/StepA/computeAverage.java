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
		System.out.printf("입력하신 점수의 총점은 %d입니다\n", getTotal());
	}
	
	public void printAverage() {
		System.out.printf("평균은 %.1f입니다.", getAverage());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("국어 점수를 입력하세요: ");
		this.kor = s.nextInt();
		
		System.out.printf("영어 점수를 입력하세요: ");
		this.eng = s.nextInt();

		System.out.printf("수학 점수를 입력하세요: ");
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
