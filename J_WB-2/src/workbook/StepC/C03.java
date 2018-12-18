package workbook.StepC;

import java.util.Scanner;

public class C03 {
	private int width, height;
	
	public C03() {
		input();
	}
	
	public void printResult() {
		if(width == height)
			System.out.println("정사각형입니다");
		else if(width >= 2 * height)
			System.out.println("좌우로 길쭉한 직사각형입니다");
		else if(height >= 2 * width)
			System.out.println("위아래로 길쭉한 직사각형입니다");
		else if(width > height)
			System.out.println("일반적인 가로형 직사각형입니다");
		else if(width < height)
			System.out.println("일반적인 세로형 직사각형입니다");

	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("직사각형의 가로 크기를 입력하세요: " );
		this.width = s.nextInt();
		
		System.out.printf("직사각형의 새로 크기를 입력하세요: " );
		this.height = s.nextInt();
	}
}
