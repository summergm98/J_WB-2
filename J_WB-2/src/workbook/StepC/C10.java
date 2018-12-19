package workbook.StepC;

import java.util.Scanner;

public class C10 {
	private int num1, num2;
	private String operator;
	private int result;
	
	public C10() {
		input();
	}
	
	public void printR() {
		System.out.printf("������ ��� ���� %d �Դϴ�\n", getResult());
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("����1 �� �Է��ϼ���: ");
		this.num1 = s.nextInt();
		System.out.print("����2 �� �Է��ϼ���: ");
		this.num2 = s.nextInt();
		System.out.print("���� ��ȣ ����(+, -, *, / �� 1��)�� �Է��ϼ���: ");
		this.operator = s.next();
	}
	
	int getResult() {
		if(operator.compareTo("+") == 0)
			result = num1 + num2;
		else if(operator.compareTo("-") == 0)
			result = num1 - num2;
		else if(operator.compareTo("*") == 0)
			result = num1 * num2;
		else if(operator.compareTo("/") == 0)
			result = num1 / num2;
		
		return result;
	}
}
