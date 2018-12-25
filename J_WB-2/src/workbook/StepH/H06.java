package workbook.StepH;

import java.util.Scanner;

public class H06 {
	private int number[] = new int[5];
	private int pow_value[][] = new int[5][5];
	private int max, min;
	private int max_a, max_b;
	private int min_a, min_b;
	
	public H06() {
		getNum();
		getPow();
		getMax();
		getMin();
	}
	
	public void printResult() {
		System.out.print("입력하신 5개의 수로 제곱수를 만들면\n"
				+ "가장 큰 수는 " + max_a + "의 " + max_b + "제곱인 " + max + " 입니다\n"
				+ "가장 작은 수는 " + min_a + "의 " + min_b + "제곱인 " + min + " 입니다\n");
	}
	
	void getNum() {
		Scanner s = new Scanner(System.in);
		System.out.print("2에서 9 사이의 숫자 5개를 입력하세요 : ");
		
		for(int i = 0; i < 5; i++) {
			this.number[i] = s.nextInt();
		}
		System.out.println("");
	}
	
	void getPow() {
		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 5; j++)
				if(i != j) {
					pow_value[i][j] = (int) Math.pow(number[i], number[j]);
				}
	}
	
	void getMax() {
		max = 0;
		
		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 5; j++)
				if(i != j)
					if(max < pow_value[i][j]) {
						max = pow_value[i][j];
						max_a = number[i];
						max_b = number[j];
					}
	}
	
	void getMin() {
		min = 2147483647;
		
		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 5; j++)
				if(i != j)
					if(min > pow_value[i][j]) {
						min = pow_value[i][j];
						min_a = number[i];
						min_b = number[j];
					}
	}
}
