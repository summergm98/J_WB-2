package workbook.StepA;

import java.util.Scanner;

public class daysToSeconds {
	private int days;
	private int seconds;
	
	public daysToSeconds() {
		intput();
	}
	
	public void printSeconds() {
		System.out.printf("날 수에 해당되는 시간은 모두 %d초 입니다\n", getSeconds());
	}
	
	void intput() {
		Scanner s = new Scanner(System.in);
		System.out.printf("날 수를 입력하세요: ");
		this.days = s.nextInt();
	}
	
	int getSeconds() {
		seconds = days * 24 * 60 * 60;
		return seconds;
	}
}
