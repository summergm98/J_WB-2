package workbook.StepC;

import java.util.Scanner;

public class C02 {
	private double input_degree;
	
	public C02() {
		input();
	}
	
	public void printResult() {
		if(input_degree < 0)
			System.out.println("�ùٸ� ���� �Է��� �ּ���!( 0 �̻� )");
		else if(input_degree >= 0 && input_degree < 25)
			System.out.println("�ü��Դϴ�");
		else if(input_degree >= 25 && input_degree < 40)
			System.out.println("�̿¼��Դϴ�");
		else if(input_degree >= 40 && input_degree < 80)
			System.out.println("�¼��Դϴ�");
		else if(input_degree >= 80)
			System.out.println("���� ���Դϴ�");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �µ��� �Է��ϼ���: " );
		this.input_degree = s.nextDouble();
	}
}
