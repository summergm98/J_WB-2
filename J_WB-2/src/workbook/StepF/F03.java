package workbook.StepF;

import java.util.Scanner;

public class F03 {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[3];
	private double[] average = new double[3];
	private int kor, eng, mat;
	private int i,j;
	
	public F03() {
		getScore();
		getSum();
		getAverage();
	}
	
	public void printR() {
		System.out.print("������ ������ " + sum[0] + " �̰�, ����� " + average[0] +" �Դϴ� \n");
		System.out.print("������ ������ " + sum[1] + " �̰�, ����� " + average[1] +" �Դϴ� \n");
		System.out.print("������ ������ " + sum[2] + " �̰�, ����� " + average[2] +" �Դϴ� \n");
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
		
		for(j = 0; j < 3; j++) {
			for(i = 0; i < 5; i++) {
				sum[j] += jumsu[i][j];
			}
			System.out.print(sum[j] + "\n");
		}
	}
	
	void getAverage() {
		for(i = 0; i < 3; i++) {
			average[i] = (double) sum[i] / (double) 5;
		}
	}
}
