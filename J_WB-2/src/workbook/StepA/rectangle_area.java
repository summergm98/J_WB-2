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
		System.out.printf("직사각형의 넓이는 %d입니다\n", getArea());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오(integer): ");
		this.width = s.nextInt();
		
		System.out.print("직사각형의 세로 크기를 입력하시오(integer): ");
		this.height = s.nextInt();
	}
	
	int getArea() {
		area = width * height;
		return area;
	}
}
