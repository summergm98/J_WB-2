package workbook.StepB;

import java.util.Scanner;

public class B07 {
	private int megabytes;
	private long bytes;
	private String usb2;
	private int time;
	
	public B07() {
		input();
	}
	void printTime() {
		System.out.printf("파일 전송 시간은 %d 초입니다\n", getTime());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 메가바이트 단위로 입력하세요: ");
		this.megabytes = s.nextInt();
		
		System.out.printf("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요: ");
		this.usb2 = s.next();	
	}
	
	int getTime() {
		bytes = megabytes * 1024 * 1024;
		
		if(usb2.compareToIgnoreCase("y") == 0)
			time = (int)(bytes / 60000000);
		else
			time = (int)(bytes / 1500000);
		
		return time;
	}
}
