package workbook.StepC;

import java.util.Scanner;

public class C11 {
	private int year;
	
	public C11() {
		input();
	}
	
	public void printR() {
		if(checkYear()) 
			System.out.println("�Է��Ͻ� �⵵�� �����Դϴ�");
		else
		System.out.println("�Է��Ͻ� �⵵�� ������ �ƴմϴ�");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ���: ");
		this.year = s.nextInt();
	}
	
	boolean checkYear() {
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}
			return false;
			}else {
			return true;
			}
		}
		return false;
	}
}
