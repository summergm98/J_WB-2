package workbook.StepA;

import java.util.Scanner;

public class rectangle_area {
	private int width;
	private int height;
	private int area;
	
	public rectangle_area() {
		input();
	}
	
	public void printArea() {
		System.out.printf("���簢���� ���̴� %d�Դϴ�\n", getArea());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�(integer): ");
		this.width = s.nextInt();
		
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�(integer): ");
		this.height = s.nextInt();
	}
	
	int getArea() {
		area = width * height;
		return area;
	}
}
