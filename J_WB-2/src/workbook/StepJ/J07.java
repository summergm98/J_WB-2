package workbook.StepJ;

import java.util.Scanner;

public class J07 {
	private int a;
	
	public J07() {
		int n = 0;
		while(true) {
			
			a = getNum();
			
			if(a == 0)
				break;
			
			n = powerOfTwo(a);
			System.out.print("2의 " + a + "제곱은  : " + n + "\n");
		}
	}
	
	int getNum() {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 (0: 종료): ");
		this.a = s.nextInt();
		
		return a;		
	}
	
	int powerOfTwo(int n) {
		if(n == 0)
			return 1;
		else
			return 2*powerOfTwo(n - 1);
	}
}
