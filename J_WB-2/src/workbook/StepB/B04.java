package workbook.StepB;

import java.util.Scanner;

public class B04 {
	private double m2_area, pyung_area;
	
	public B04() {
		input();
	}

	public void printfResult() {
		System.out.printf("����Ʈ�� ������ %.1f �̰�,\n", getPyung());
		
		if(pyung_area < 30)
			System.out.printf("30�� �̸��̹Ƿ� ���� ����Ʈ�Դϴ�\n");
		else
			System.out.printf("30�� �̻��̹Ƿ� ū ����Ʈ�Դϴ�\n");
		
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
