package workbook.StepE;

import java.util.Scanner;

public class E06 {
	private int rows, columns;
	private int number;
	private int i, j;

	public E06() {
		getRC();
	}
	
	public void printT() {
		for(i = 1; i <= rows; i++) {
			for(j = 1; j <= columns; j++) {
				if(i * j < 10)
					System.out.print(i * j + "   ");
				else if(i * j >= 10 && i * j < 100)
					System.out.print(i * j + "  ");
				else
					System.out.print(i * j + " ");
			}
			System.out.print("\n");
		}
	}
	void getRC(){
		Scanner s = new Scanner(System.in);
		System.out.print("출력하려는 행의 크기와 열의 크기를 입력하시오: " );
		this.rows = s.nextInt();
		this.columns = s.nextInt();
	}
}
