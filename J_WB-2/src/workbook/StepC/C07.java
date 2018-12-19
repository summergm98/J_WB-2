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
		System.out.printf("���� ���� �ð��� %.1f ���Դϴ�\n", cmpTime());
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���: ");
		this.megabytes = s.nextInt();
		System.out.printf("���� ��� 1: Wi-Fi 2: BlueTooth 3: LTE 4: USB\n");
		System.out.printf("���� ����� �����Ͽ� �Է��ϼ���: ");
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
			System.out.println("�ùٸ� ���� �Է��� �ּ���");
			return 0;
		}
		return time;
	}
}
