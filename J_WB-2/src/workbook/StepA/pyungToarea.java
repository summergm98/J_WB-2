package workbook.StepA;

import java.util.Scanner;

public class pyungToarea {
	double m2_area;
	double pyung_area;
	
	public pyungToarea() {
		input();
	}
	
	public void printArea() {
		System.out.printf("����Ʈ�� ������ %.1f�Դϴ�\n", getArea());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("����Ʈ�� �о� ������ �Է��Ͻÿ�: ");
		this.m2_area = s.nextDouble();
	}
	
	double getArea() {
		pyung_area = m2_area / 3.305;
		return pyung_area;
	}
}
