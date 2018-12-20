package workbook.StepD;

import java.util.Scanner;
public class D06 {
	private double m2_area;
	private double pyung_area;
	private int count1, count2, count3, count4;
	private int i;
	
	public D06() {
		action();
	}
	
	public void printR() {
		System.out.println("\"���� ����Ʈ\"�� ������ " + count1 +"�� �Դϴ�");
		System.out.println("\"�߼��� ����Ʈ\"�� ������ " + count2 +"�� �Դϴ�");
		System.out.println("\"���� ����Ʈ\"�� ������ " + count3 +"�� �Դϴ�");
		System.out.println("\"���� ����Ʈ\"�� ������ " + count4 +"�� �Դϴ�");
		
	}
	void action() {
		count1 = 0;
		count2 = 0;
		count3 = 0;
		count4 = 0;
		
		for(i = 0; i < 10; i++) {
			input();
			print_pyung();
			checkSize();
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("����Ʈ�� �о� ����(��������)�� �Է��ϼ��� :");
		this.m2_area = s.nextDouble();
	}
	
	void print_pyung() {
		pyung_area = m2_area / 3.305;
		System.out.printf("-->�� ����Ʈ�� ������ %.1f �Դϴ�\n", pyung_area);
	}
	
	void checkSize() {
		if(pyung_area < 15)
			count1++;
		else if(pyung_area >= 15 && pyung_area < 30)
			count2++;
		else if(pyung_area >= 30 && pyung_area < 50)
			count3++;
		else if(pyung_area >= 50)
			count4++;
	}
}
