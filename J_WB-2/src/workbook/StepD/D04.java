package workbook.StepD;

import java.util.Scanner;

public class D04 {
	private int count_all;
	private int count_young;
	private int birth_year;
	private int age;
	private int i;
	
	public D04() {
		input();
	}
	
	public void printR() {
		System.out.printf("������ �߿� �̼����ڴ� ��� %d ���Դϴ�\n", count_young);
	}
	void input() {
		Scanner s = new Scanner(System.in);
		count_young = 0;
		
		System.out.print("������ �� ������ �Է��ϼ���: ");		
		this.count_all = s.nextInt();
		
		for(i = 0; i < count_all; i++) {
			System.out.print("�¾ �⵵�� �Է��ϼ���: " );
			this.birth_year = s.nextInt();
			checkY();
		}
	}
	
	void checkY() {
		if(cmpAge() < 20)
			count_young++;
	}
	
	int cmpAge() {
		age = 2018 - birth_year + 1;
		return age;
	}
}
