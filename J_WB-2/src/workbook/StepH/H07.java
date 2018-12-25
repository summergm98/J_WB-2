package workbook.StepH;

import java.util.Scanner;

public class H07 {
	private String input;
	
	public H07() {
		getInput();
	}
	
	public void printResult() {
		int length = getLength();
		
		System.out.printf("총 문자의 개수는 %d개 입니다\n", length);
		
		printChar(length);
	}
	
	void getInput() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요\n--> ");
		this.input = s.nextLine();
	}
	
	int getLength() {
		int length = input.length();
		return length;
	}
	
	void printChar(int n) {
		for(int i = 0; i < n; i++)
			System.out.println("--> " + input.charAt(i));
	}
}
