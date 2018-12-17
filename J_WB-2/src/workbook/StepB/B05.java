package workbook.StepB;

import java.util.Scanner;

public class B05 {
	private int days, seconds;
	private int m_count;
	
	public B05() {
		input();
	}
	
	void printResult() {
		System.out.printf("날 수에 해당되는 기간은 모두 %d 초입니다\n", getSeconds());
		
		m_count = 0;
		if(m_count != 0)
			System.out.printf("100초가 모두 %d번 포함됩니다\n", getCounts());
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("날 수를 입력하세요: ");
		this.days = s.nextInt();
	}
	
	int getSeconds() {
		seconds = days * 24 * 60 * 60;
		return seconds;
	}
	
	int getCounts() {
		m_count = seconds / 1000000;
		return m_count;
	}
}

