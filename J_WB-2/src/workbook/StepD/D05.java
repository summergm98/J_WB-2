package workbook.StepD;

import java.util.Scanner;

public class D05 {
	private int width, height;
	private int count1, count2, count3, count4, count5;
	
	public D05() {
		checkRectangle();
	}
	
	public void printR() {
		System.out.println("\"���簢��\"�� ������ " + count1 + "�� �Դϴ�");
		System.out.println("\"�¿�� ������ ���簢��\"�� ������ " + count2 + "�� �Դϴ�");
		System.out.println("\"���Ʒ��� ������ ���簢��\"�� ������ " + count3 + "�� �Դϴ�");
		System.out.println("\"�Ϲ����� ������ ���簢��\"�� ������ " + count4 + "�� �Դϴ�");
		System.out.println("\"�Ϲ����� ������ ���簢��\"�� ������ " + count5 + "�� �Դϴ�");
	}
	void checkRectangle() {
		while(true) {
			input();
			if(width <= 0 && height <= 0) {
				return;
			}else {
				if(width == height)
					count1++;
				else if(width >= 2 * height)
					count2++;
				else if(height >= 2 * width)
					count3++;
				else if(width > height)
					count4++;
				else if(width <height)
					count5++;
				}
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���簢���� ���� ũ��� ���� ũ�⸦ �Է��Ͻÿ�: ");
		this.width = s.nextInt();
		this.height = s.nextInt();
	}
}
