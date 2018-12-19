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
		System.out.printf("입력하신 점수의 총점은 %d 이고,\n", cmpTotal());
		System.out.printf("평균은 %.1f 입니다.\n", cmpAverage());
		
		if(cmpAverage() >= 90)
			System.out.println("수입니다");
		else if(cmpAverage() >= 80 && cmpAverage() < 90)
			System.out.println("우입니다");
		else if(cmpAverage() >= 70 && cmpAverage() < 80)
			System.out.println("미입니다");
		else if(cmpAverage() >= 60 && cmpAverage() < 70)
			System.out.println("양입니다");
		else if(cmpAverage() < 60)
			System.out.println("가입니다");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요: ");
		this.kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		this.eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
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
