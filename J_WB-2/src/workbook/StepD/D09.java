package workbook.StepD;

import java.util.Scanner;

public class D09 {
	private int dan;
	private int i;
	
	public D09() {
		getDan();
	}
	
	public void printR() {
		for(i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + dan * i );
		}
	}
	void getDan() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����ϰ� ���� �������� �� ���� �Է��ϼ���(2~9): ");
		this.dan = s.nextInt();
		
		if(dan < 2 || dan > 9) {
			System.out.print("�߸� �Է��ϼ̽��ϴ� \n");
			getDan();
		}else
			return;
	}
	
	
}
