package workbook.StepB;

import java.util.Scanner;

public class B03 {
	private int width, height;
	private int area;
	
	public B03() {
		input();
	}
	
	public void result() {
		System.out.printf("���簢���� ���̴� %d �̰� \n", computeArea());
		
		if(width == height)
			System.out.printf("���簢���Դϴ�.\n");
		else
			System.out.printf("���簢���� �ƴմϴ� .\n");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���簢���� ���� ũ�⸦ �Է��Ͻÿ�: ");
		this.width = s.nextInt();
		
		System.out.printf("���簢���� ���� ũ�⸦ �Է��Ͻÿ�: ");
		this.height = s.nextInt();
	}
	
	int computeArea() {
		area = width * height;
		return area;
	}
}
