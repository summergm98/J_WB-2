package workbook.StepI;

import java.util.Scanner;

public class I02 {
	private char c;
	private int blank;
	private int size;
	
	public I02() {
		getData();
		printCharWithBlank(blank, size, c);
	}
	
	void getData() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("직각 삼각형을 그리는데 사용할 문자를 입력하세요 : ");
		this.c = s.next().charAt(0);
		
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하세요 : ");
		this.size = s.nextInt();
		this.blank = s.nextInt();
	}
	
	void printCharWithBlank(int blanks, int size, char ch) {
		int k = 1;
		int i = 0;
		int j = 0;
		
		while(k <= size) {
			for(i = blanks + size - k; i > 0; i--) 
				System.out.print(" ");
			for(j = 0; j < k; j++)
				System.out.print(ch);
			System.out.print("\n");
			k++;
		}
	}

}
