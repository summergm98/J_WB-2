package workbook.StepC;

import java.util.Scanner;

public class C07 {
	private int megabytes;
	private long bytes;
	private byte kind;
	private double time;
	
	public C07() {
		input();
	}
	
	public void printR() {
		System.out.printf("파일 전송 시간은 %.1f 초입니다\n", cmpTime());
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 메가바이트 단위로 입력하세요: ");
		this.megabytes = s.nextInt();
		System.out.printf("전송 방식 1: Wi-Fi 2: BlueTooth 3: LTE 4: USB\n");
		System.out.printf("전송 방식을 선택하여 입력하세요: ");
		this.kind = s.nextByte();		
	}
	
	double cmpTime() {
		if(kind == 1)
			time = (double)(megabytes * 1024 * 1024) / 1500000;
		else if(kind == 2)
			time = (double)(megabytes * 1024 * 1024) / 300000;
		else if(kind == 3)
			time = (double)(megabytes * 1024 * 1024) / 1000000;
		else if(kind == 4)
			time = (double)(megabytes * 1024 * 1024) / 60000000;
		else {
			System.out.println("올바른 값을 입력해 주세요");
			return 0;
		}
		return time;
	}
}
