package workbook.StepD;

import java.util.Scanner;

public class D07 {
	private int a, b;
	private int x_begin, x_end;
	private int x, y;
	
	public D07() {
		getA_B();
		getX();
	}
	
	public void printR() {
		for(int i = x_begin; i <= x_end; i++ ) {
			System.out.printf("��ǥ (%d, %d)\n" ,i, cmpEquation(i));
		}
		
	}
	
	void getA_B() {
		Scanner s = new Scanner(System.in);
		System.out.print("1�� �Լ� y = ax + b�� ��� a�� b�� �Է��ϼ���: ");
		this.a = s.nextInt();
		this.b = s.nextInt();
	}
	
	void getX() {
		Scanner s = new Scanner(System.in);
		System.out.print("x��ǥ�� ���� ���� �� ���� �Է��ϼ���: ");
		this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
	}
	
	int cmpEquation(int x) {
		y = a * x + b;
		return y;
	}
}
