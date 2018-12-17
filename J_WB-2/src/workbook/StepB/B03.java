package workbook.StepB;

import java.util.Scanner;

public class B03 {
	private int width, height;
	private int area;
	
	public B03() {
		input();
	}
	
	public void result() {
		System.out.printf("직사각형의 넓이는 %d 이고 \n", computeArea());
		
		if(width == height)
			System.out.printf("정사각형입니다.\n");
		else
			System.out.printf("정사각형이 아닙니다 .\n");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("직사각형의 가로 크기를 입력하시오: ");
		this.width = s.nextInt();
		
		System.out.printf("직사각형의 세로 크기를 입력하시오: ");
		this.height = s.nextInt();
	}
	
	int computeArea() {
		area = width * height;
		return area;
	}
}
