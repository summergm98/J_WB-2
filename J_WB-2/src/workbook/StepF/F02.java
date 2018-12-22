package workbook.StepF;

import java.util.Scanner;

public class F02 {
	private double score[] = new double[10];
	private double newArray[] = new double[10];
	private double maxscore, minscore;
	private double total;
	private double average;
	private int newnum;
	private int i;
	
	public F02() {
		getScore();
		sortArray();
	}
	
	public void printR() {
		getAverage();
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� ������� %.1f�Դϴ�\n", average);
	}
	void getScore() {
		Scanner s = new Scanner(System.in);
		
		for(i = 0; i < score.length; i++) {
			System.out.printf("%d�� �ɻ������� �Է��ϼ���: ", i+1);
			this.score[i] = s.nextDouble();
		}
	}
	
	void sortArray() {	
		for(int i = 0; i < score.length; i++) {
			newArray[i] = score[i];
		}
		
		for(int n = 0; n < newArray.length; n++) {
			for(int m = 0; m < n; m++) {
				if(newArray[n] < newArray[m]) {
					double temp = newArray[n];
					newArray[n] = newArray[m];
					newArray[m] = temp;
				}
			}
		}
	}
	
	void getAverage() {
		maxscore = newArray[newArray.length - 1];
		minscore = newArray[0];
		
		for(i = 0; i < score.length; i++) {
			total += score[i];
		}
		average = (total - maxscore - minscore) / (score.length - 2);
	}
}
