package workbook.StepJ;

import java.util.Scanner;

public class J02 {
	private double num[] = new double[10];
	
	public J02() {
		getNums();
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다\n" , getAverage());
	}
	
	void getNums() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번 심사 점수를 입력하세요 : ");
			this.num[i] = s.nextDouble();
		}		
	}
	
	double Max(double num[]) {
		double max = -1;
		
		for(int i = 0; i < 10; i++) {
			if(max < num[i])
				max = num[i];
		}
		
		return max;
	}
	
	double Min(double num[]) {
		double min = 999;
		
		for(int i = 0; i < 10; i++) {
			if(min > num[i])
				min = num[i];
		}
		
		return min;
	}
	
	double getAverage() {
		double total = 0;
		double max = Max(num);
		double min = Min(num);
		double average = 0.0;
		
		for(int i = 0; i < 10; i ++) {
			total += num[i];
		}
		
		average = (total - max - min) / 8;
		return average;
	}
}
