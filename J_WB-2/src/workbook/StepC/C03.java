package workbook.StepC;

import java.util.Scanner;

public class C03 {
	private int width, height;
	
	public C03() {
		input();
	}
	
	public void printResult() {
		if(width == height)
			System.out.println("���簢���Դϴ�");
		else if(width >= 2 * height)
			System.out.println("�¿�� ������ ���簢���Դϴ�");
		else if(height >= 2 * width)
			System.out.println("���Ʒ��� ������ ���簢���Դϴ�");
		else if(width > height)
			System.out.println("�Ϲ����� ������ ���簢���Դϴ�");
		else if(width < height)
			System.out.println("�Ϲ����� ������ ���簢���Դϴ�");

	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���簢���� ���� ũ�⸦ �Է��ϼ���: " );
		this.width = s.nextInt();
		
		System.out.printf("���簢���� ���� ũ�⸦ �Է��ϼ���: " );
		this.height = s.nextInt();
	}
}
