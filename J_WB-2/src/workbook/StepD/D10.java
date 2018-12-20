package workbook.StepD;

import java.util.Scanner;

public class D10 {
	private int num1, num2;
	private int i;
	
	public D10() {
		getNum();
	}
	
	public void printR() {
		for(i = 1; i <= 100; i++) {
			if(i % num1 == 0)
				if(i % num2 != 0)
					System.out.print(i + " ");
			if(i % num2 == 0)
				if(i % num1 != 0)
					System.out.print(i + " ");
		}
		System.out.print("\n");
	}
	void getNum() {
		Scanner s = new Scanner(System.in);
		System.out.print("2개의 숫자를 입력하시오: ");
		this.num1 = s.nextInt();
		this.num2 = s.nextInt();
	}
	
	
}
