package workbook.StepJ;

import java.util.Scanner;

public class J09 {
	private int n, a;
	
	public J09() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자 2개를 입력하세요: ");
		this.n= s.nextInt();
		this.a = s.nextInt();
		
		System.out.printf("%d의 %d제곱은 %d 입니다\n", n, a, power(n, a));
	}
	
	int power(int num1, int num2) {
		if(num2 == 0)
			return 1;
		else if(num2 == 1)
			return num1;
		else if(num2 > 1 && num2 % 2 == 0)
			return power(num1, num2 / 2) * power(num1, num2 / 2);
		else if(num2 > 1 && num2 % 2 == 1)
			return power(num1, num2 / 2) * power(num1, num2 / 2) * num1;
		else 
			return -1;
	}
}
