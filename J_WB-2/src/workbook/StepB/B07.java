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
		System.out.printf("���� ���� �ð��� %d ���Դϴ�\n", getTime());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���: ");
		this.megabytes = s.nextInt();
		
		System.out.printf("USB ��Ʈ�� 2.0�̸� Y, �ƴϸ� N�� �Է��ϼ���: ");
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
