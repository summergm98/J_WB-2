package workbook.StepA;

import java.util.Scanner;

public class computeBytes {
	private int gigabytes;
	private int megabytes;
	private int kilobytes;
	private long bytes;
	
	public computeBytes() {
		input();
	}

	public void printMegabytes() {
		System.out.printf("입력하신 파일 용량은 %d 메가바이트입니다\n", getMegabytes());
		
	}

	public void printKilobytes() {
		System.out.printf("입력하신 파일 용량은 %d 킬로바이트입니다\n", getKilobytes());		
	}

	public void printBytes() {
		System.out.printf("입력하신 파일 용량은 %d 바이트입니다\n", getBytes());		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 기가바이트 단위로 입력하세요: ");
		this.gigabytes = s.nextInt();
	}
	
	int getMegabytes() {
		megabytes = gigabytes * 1024;
		return megabytes;
	}
	
	int getKilobytes() {
		kilobytes = megabytes * 1024;
		return kilobytes;
	}
	
	long getBytes() {
		bytes = (long)kilobytes * (long)1024;
		return bytes;
	}
}
