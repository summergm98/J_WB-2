package workbook.StepB;

import java.util.Scanner;

public class B08 {
	private int num1, num2, num3;
	
	public B08() {
		input();
	}
	
	public void printResult() {
		condition1();
		condition2();
		condition3();
		condition4();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("ù ��° ���ڸ� �Է��ϼ���: ");
		this.num1 = s.nextInt();
		System.out.printf("�� ��° ���ڸ� �Է��ϼ���: ");
		this.num2 = s.nextInt();
		System.out.printf("�� ��° ���ڸ� �Է��ϼ���: ");
		this.num3 = s.nextInt();
	}
	
	void condition1() {
		int n = 0;
		
		if(num1 == num2)
			n++;
		if(num2 == num3)
			n++;
		if(num1 == num3)
			n++;
		
		if(n != 0) 
			System.out.printf("1�� ���� ���� : 3���� ���� �� ��� �� ���� ���� ����.\n");
	}
	
	void condition2() {
		int n = 0;
		
		if(num1 > 50)
			n++;
		if(num2 > 50)
			n++;
		if(num3 > 50)
			n++;
		
		if( n >=2 ) 
			System.out.printf("2�� ���� ���� : 3���� ���� �� ��� �� ���� ũ�Ⱑ ��� 50 ���� ũ��.\n");
	}
	
	void condition3() {
		int n = 0;
		
		if(num1 + num2 == num3)
			n ++;
		if(num1 + num3 == num2)
			n++;
		if(num2 + num3 == num1)
			n++;
		
		if( n != 0 )
			System.out.printf("3�� ���� ���� : 3���� ���� �� � �� ���� ���� ������ �ϳ��� ���ڿ� ����.\n");
	}
	
	void condition4() {
		int n = 0;
		
		if(num1 / num2 == 0)
			n++;
		if(num1 / num3 == 0)
			n++;
		if(num2 / num1 == 0)
			n++;
		if(num2/ num3 == 0)
			n++;
		if(num3 / num1 == 0)
			n++;
		if(num3 / num2 == 0)
			n++;
		
		if( n != 0)
			System.out.printf("4�� ���� ���� : 3���� ���� �� � �ϳ��� ���� �ٸ� �� ���� ������ ����������� ��찡 �ִ�.\n");
	}
}
