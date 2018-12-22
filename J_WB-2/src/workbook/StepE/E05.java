package workbook.StepE;

import java.util.Scanner;

public class E05 {
	private int mode;
	private int column;
	private int i, j;
	
	public E05() {
		getMode();
	}
	
	public void printR() {
		if(mode == 1) {
			printODD();
		}else if(mode == 2 ) {
			printEVEN();
		}
	}
	
	void getMode() {
		Scanner s = new Scanner(System.in);
		System.out.print("�������� ��� ���(1: Ȧ���� 2: ¦����): ");
		this.mode = s.nextInt();
		System.out.print("�� �ٿ� ����� ������ �Է��ϼ���: ");
		this.column = s.nextInt();
	}
	
	void printODD() {
		int count = 0;
		for(i = 3; i < 10; i += 2) {
			count = 0;
			for(j = 1; j < 10; j++) {
				System.out.print(i + " x " + j + " = " + i * j);
				count++;
				if(count == column) {
					System.out.printf("\n");
					count = 0;
				}else if(i * j / 10 != 0 ){
					System.out.print("   ");
				}else {
					System.out.print("    ");
				}
			}
			System.out.print("\n");
		}
	}
	
	void printEVEN() {
		int count = 0;
		for(i = 2; i < 10; i += 2) {
			count = 0;
			for(j = 1; j < 10; j++) {
				System.out.print(i + " x " + j + " = " + i * j);
				count++;
				if(count == column) {
					System.out.printf("\n");
					count = 0;
				}else if(i * j / 10 != 0 ){
					System.out.print("   ");
				}else {
					System.out.print("    ");
				}
			}
			System.out.print("\n");
		}
	}
}
