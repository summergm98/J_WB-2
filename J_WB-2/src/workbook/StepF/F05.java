package workbook.StepF;

import java.util.Scanner;

public class F05 {
	private int height, weight;
	private int bmi;
	private int bmilist[][] = new int[10][3];
	private int count;
	private int i;
	
	public F05() {
		getData();
	}
	
	public void printR() {
		for(i = 0; i < 10; i++)
			getCount(i);
		
		System.out.println("\n총 " + count +"명의 사람이 비만입니다");
	}
	
	void getData() {
		Scanner s = new Scanner(System.in);
		for(i = 0; i < 10; i++) {
			System.out.printf("%d번째 사람의 신장(cm)과 체중(kg)을 입력하세요: " , i+1);
			this.height = s.nextInt();
			this.weight = s.nextInt();
			
			bmilist[i][0] = height;
			bmilist[i][1] = weight;
			bmilist[i][2] = getBMI(height, weight);
		}
	}
	
	int getBMI(int h, int w) {
		double h_m = (double) h / 100.0;
		bmi = (int)(w / (h_m*h_m));
		return bmi;
	}
	
	void getCount(int n) {
		if(bmilist[n][2] >= 25) {
			System.out.printf("%d번째 사람은 비만입니다\n", n+1);
			count ++;
		}
	}
}
