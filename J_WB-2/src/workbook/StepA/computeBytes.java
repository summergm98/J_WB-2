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
		System.out.printf("�Է��Ͻ� ���� �뷮�� %d �ް�����Ʈ�Դϴ�\n", getMegabytes());
		
	}

	public void printKilobytes() {
		System.out.printf("�Է��Ͻ� ���� �뷮�� %d ų�ι���Ʈ�Դϴ�\n", getKilobytes());		
	}

	public void printBytes() {
		System.out.printf("�Է��Ͻ� ���� �뷮�� %d ����Ʈ�Դϴ�\n", getBytes());		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �뷮�� �Ⱑ����Ʈ ������ �Է��ϼ���: ");
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
