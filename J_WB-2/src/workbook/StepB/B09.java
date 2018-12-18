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
			System.out.printf("당신은 비만입니다\n");
		else
			System.out.printf("당신은 비만이 아닙니다.\n");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("신장(cm)을 입력하세요 : ");
		this.height = s.nextInt();
		System.out.printf("체중(kg)을 입력하세요 : ");
		this.weight = s.nextInt();
	}
	
	int checkBMI() {
		double m_height = (double)height / 100.0;
		bmi = (int)(weight / (m_height * m_height));
		return bmi;
	}
}
