package workbook.StepC;

import java.util.Scanner;

public class C04 {

	private double m2_area, pyung_area;
	
	public C04() {
		input();
	}
	
	public void printfResult() {
		System.out.printf("����Ʈ�� ������ %.1f �̰�,\n", getPyung());
		
		if(pyung_area < 15.0)
			System.out.println("���� ����Ʈ�Դϴ�");
		else if(pyung_area >= 15 && pyung_area < 30)
			System.out.println("�߼��� ����Ʈ�Դϴ�");
		else if(pyung_area >= 30 && pyung_area < 50)
			System.out.println("���� ����Ʈ�Դϴ�");
		else if(pyung_area >= 50)
			System.out.println("���� ����Ʈ�Դϴ�");
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�: ");
		this.m2_area = s.nextDouble();
	}
	
	double getPyung() {
		pyung_area = m2_area / 3.305;
		return pyung_area;
	}
}
