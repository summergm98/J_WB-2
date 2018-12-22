package workbook.StepF;

import java.util.Scanner;

public class F04 {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[5];
	private double[] average = new double[5];
	private int kor, eng, mat;
	private int i,j;
	
	public F04() {
		getScore();
		getSum();
		getAverage();
	}
	
	public void printR() {
		for(i = 0; i < 5; i++) {
			System.out.printf("%d�� �л��� ������ %d �̰�, ����� %.1f �Դϴ�\n", i + 1, sum[i], average[i]);
		}
	}
	
	void getScore() {
		Scanner s = new Scanner(System.in);
		
		for(i = 0; i < 5; i++) {
			System.out.printf("%d�� �л� ����, ����, ���� ������ �Է��Ͻÿ�: ", i + 1);
			this.kor = s.nextInt();
			this.eng = s.nextInt();
			this.mat = s.nextInt();
				
			jumsu[i][0] = kor;
			jumsu[i][1] = eng;
			jumsu[i][2] = mat;
		}
	}
	
	void getSum() {
		
		for(i = 0; i < 3; i++)
			sum[i] = 0;
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 3; j++)
				sum[i] += jumsu[i][j];
		}
	}
	
	void getAverage() {
		for(i = 0; i < 5; i++) {
			average[i] = (double) sum[i] / (double) 3;
		}
	}
}
