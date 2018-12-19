package workbook.StepC;


import java.util.Scanner;

public class C08 {
	private int num1, num2, num3;
	private int max_num, min_num;
	
	public C08() {
		input();
	}
	
	public void printR() {
		System.out.printf("가장 큰 수는 %d 이고, 가장 작은 수는 %d 입니다\n", getMax(), getMin());
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		this.num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		this.num2 = s.nextInt();
		System.out.print("세번째 숫자를 입력하세요: ");
		this.num3 = s.nextInt();
	}
	
	int getMax() {
		if(num1 >= num2)
			if(num1 >= num3)
				max_num = num1;
			else
				max_num = num3;
		else if(num2 > num1)
			if(num2 >= num3)
				max_num = num2;
			else
				max_num = num3;
		
		return max_num;
	}
	
	int getMin() {
		if(num1 <= num2)
			if(num1 <= num3)
				min_num = num1;
			else
				min_num = num3;
		else if(num2 < num1)
			if(num2 <= num3)
				min_num = num2;
			else
				min_num = num3;
		
		return min_num;
	}
}
