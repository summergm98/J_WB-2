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
		System.out.printf("첫 번째 숫자를 입력하세요: ");
		this.num1 = s.nextInt();
		System.out.printf("두 번째 숫자를 입력하세요: ");
		this.num2 = s.nextInt();
		System.out.printf("세 번째 숫자를 입력하세요: ");
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
			System.out.printf("1번 조건 만족 : 3개의 숫자 중 적어도 두 수의 값이 같다.\n");
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
			System.out.printf("2번 조건 만죽 : 3개의 숫자 중 적어도 두 수의 크기가 모두 50 보다 크다.\n");
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
			System.out.printf("3번 조건 만족 : 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다.\n");
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
			System.out.printf("4번 조건 만족 : 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어떨어지는 경우가 있다.\n");
	}
}
