package workbook.StepE;

import java.util.Scanner;

public class E02 {
	private int height;
	private int blank;
	private int i, j;
	
	public E02() {
		getHeight();
	}
	
	public void printTri() {
		int k = 1;
		while(k <= height) {
			for(i = blank + height - k; i > 0; i--) 
				System.out.print(" ");
			for(j = 0; j < k; j++)
				System.out.print("*");
			System.out.print("\n");
			k++;
		}

	}
	void getHeight() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �ﰢ���� ���̿� ���� ������ ũ�⸦ �Է��Ͻÿ�: ");
		this.height = s.nextInt();
		this.blank = s.nextInt();
	}
	
}
