package workbook.StepE;

import java.util.Scanner;

public class E01 {
	private int length;
	private int i,j;
	
	public E01() {
		getLength();
	}
	
	public void printSquare() {
		for(i = 0; i < length; i++) {
			for(j = 0; j < length; j++) {
				System.out.print("# ");
			}
			System.out.print("\n");
		}
	}
	void getLength() {
		Scanner s = new Scanner(System.in);
		System.out.print("���簢���� ũ�⸦ �Է��Ͻÿ� :");
		this.length = s.nextInt();
	}
}
