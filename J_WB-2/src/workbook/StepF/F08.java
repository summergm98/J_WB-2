package workbook.StepF;

import java.util.Scanner;

public class F08 {
	private int number[] = new int[10];
	private int newnum;
	private int count;
	private boolean dup;
	private int i;
	
	public F08() {
		getNumber();
	}
	
	public void printR() {
		for(i = 0; i < 10; i++)
			System.out.println((i + 1) + "번째 숫자는 " + number[i] + "입니다");
	}
	void getNumber() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1부터 100 사이의 숫자를 입력하세요.");
		count = 1;
		
		while(count <= 10) {
			System.out.printf("%d번째 숫자를 입력하세요: " , count);
			this.newnum = s.nextInt();
			
			if(checkOverlap(newnum)) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			}else {
				number[count - 1] = newnum;
				count++;
			}
		}
	}
	
	boolean checkOverlap(int n) {
		if(count == 1)
			return false;
		
		for(i = 1; i <= count; i++)
			if(n == number[i - 1])
				return true;
		
		return false;
	}
}
