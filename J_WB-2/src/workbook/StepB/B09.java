package workbook.StepB;


import java.util.Scanner;

public class B09 {
	private int height, weight;
	private int bmi;
	
	public B09() {
		input();
	}
	
	public void printResult() {
		if(checkBMI() >= 25)
			System.out.printf("����� ���Դϴ�\n");
		else
			System.out.printf("����� ���� �ƴմϴ�.\n");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("����(cm)�� �Է��ϼ��� : ");
		this.height = s.nextInt();
		System.out.printf("ü��(kg)�� �Է��ϼ��� : ");
		this.weight = s.nextInt();
	}
	
	int checkBMI() {
		double m_height = (double)height / 100.0;
		bmi = (int)(weight / (m_height * m_height));
		return bmi;
	}
}
