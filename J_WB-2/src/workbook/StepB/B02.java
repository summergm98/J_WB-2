package workbook.StepB;

import java.util.Scanner;

public class B02 {
	private double input_degree;
	private String kind;
	private double output_degree;
	
	public B02() {
		input();
	}
	
	public void printDegree() {
		computeDegree();
		
		System.out.printf("��ȯ�� �µ��� %.1f �Դϴ�\n", output_degree);
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�µ��� �Է��ϼ���: ");
		this.input_degree = s.nextDouble();
		
		System.out.printf("�Է��Ͻ� �µ��� �����µ��̸� C ��, ȭ���µ��̸� F �� �Է��ϼ���: ");
		this.kind = s.next();
	}
	
	void computeDegree() {
		if(kind.compareTo("C") == 0 || kind.compareTo("c") == 0) {
			output_degree = input_degree * 1.8 + 32;
		}else {
			output_degree = (input_degree - 32) / 1.8;
		}
	}
}
