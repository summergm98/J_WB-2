package workbook.StepA;

import java.util.Scanner;

public class cTOf {
	private double c_degree;
	private double f_degree;
	
	public cTOf() {
		input();
	}
	
	public void print_F(){
		System.out.printf("ȭ�� �µ��� %.1f�Դϴ�\n", getF_degree());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �µ��� �Է��Ͻÿ�: ");
		this.c_degree = s.nextDouble();
	}
	
	double getF_degree() {
		f_degree = c_degree * 1.8 + 32;
		return this.f_degree;
	}
}
