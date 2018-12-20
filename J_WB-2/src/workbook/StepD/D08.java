package workbook.StepD;

import java.util.Scanner;

public class D08 {
	private int a, b, c;
	private int x_begin, x_end;
	private int x, y;
	
	public D08() {
		getABC();
		getX();
	}
	
	public void printR() {
		for(int i = x_begin; i <= x_end; i++) {
			System.out.printf("좌표 (%d, %d)\n" ,i, cmpEquation(i));
		}
	}
	void getABC() {
		Scanner s = new Scanner(System.in);
		System.out.print("2차 함수 y = ax^2 + bx + c의 계수 a와 b, c를 입력하세요: ");
		this.a = s.nextInt();
		this.b = s.nextInt();
		this.c = s.nextInt();
	}
	
	void getX() {
		Scanner s = new Scanner(System.in);
		System.out.print("x좌표의 시작 값과 끝 값을 입력하세요: ");
		this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
	}
	
	int cmpEquation(int x) {
		y = a * x * x + b * x + c;
		return y;
	}
}
