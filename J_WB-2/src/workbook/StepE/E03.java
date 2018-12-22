package workbook.StepE;

import java.util.Scanner;

public class E03 {
	private int height;
	private int blank;
	private int i, j;
	
	public E03() {
		getHeight();
	}
	
	public void printTri() {
		int k = 1;
		while(k <= height) {
			for(i = 1; i <= (2*height - 1) / 2 - k + 1; i++)
				System.out.print("1");
			for(j = 1; j <= 2*k-1; j++)
				System.out.print("*");
			System.out.print("\n");
			k++;
		}
	}
	void getHeight() {
		Scanner s = new Scanner(System.in);
		System.out.print("이등변 삼각형의 높이를 입력하시오: ");
		this.height = s.nextInt();
	}
	
}
