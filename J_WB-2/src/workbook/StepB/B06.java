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
		System.out.printf("입력하신 점수의 총점은 %d 이고,\n" , getTotal());
		System.out.printf("평균은 %.1f 입니다.\n", getAverage());
		
		if(kor >= 90)
			System.out.print("국어 점수가 우수합니다.\n");
		if(eng >= 90)
			System.out.print("영어 점수가 우수합니다.\n");
		if(math >= 90)
			System.out.print("수학 점수가 우수합니다.\n");
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
		average = (double)total / 3;
		return average;
	}
}
