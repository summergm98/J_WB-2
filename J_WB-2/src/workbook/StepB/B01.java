package workbook.StepB;

import java.util.Scanner;

public class B01 {
	private int birth_year;
	private int age;
	
	public B01() {
		input();
	}
	
	public void printResult() {
		
		computeAge();
		
		if(age < 20)
			System.out.printf("�̼������Դϴ�\n");
		else
			System.out.printf("�̼����ڰ� �ƴմϴ�.\n");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�¾ �⵵�� �Է��ϼ���: ");
		
		this.birth_year = s.nextInt();
	}
	
	void computeAge() {
		age = 2018 - birth_year + 1; 
	}
	
}
