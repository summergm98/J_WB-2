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
		System.out.printf("계산식의 결과 값은 %d 입니다\n", getResult());
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자1 을 입력하세요: ");
		this.num1 = s.nextInt();
		System.out.print("숫자2 를 입력하세요: ");
		this.num2 = s.nextInt();
		System.out.print("연산 기호 문자(+, -, *, / 중 1개)를 입력하세요: ");
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
