package workbook.StepC;

import java.util.Scanner;

public class C09 {
	private int income;
	private int tax;
	
	public C09() {
		input();
	}
	
	public void printTax() {
		System.out.printf("연봉 굼액에 대한 소득세는 %d원 입니다\n", getTax());
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("연봉(원 단위)을 숫자로 입력하세요: ");
		this.income = s.nextInt();
	}
	
	int getTax() {
		if(income < 10000000)
			tax = (int) (income * 0.095);
		else if(income >= 10000000 && income < 40000000)
			tax = (int) (income * 0.19);
		else if(income >= 40000000 && income < 80000000)
			tax = (int) (income * 0.28);
		else if(income >= 80000000)
			tax = (int) (income * 0.37);
		
		return tax;
	}
}
