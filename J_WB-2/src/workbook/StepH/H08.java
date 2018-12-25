package workbook.StepH;

import java.util.Scanner;

public class H08 {
	private String input;
	private String findStr;
	private String replaceStr;
	
	public H08() {
		getInput();
	}
	
	public void replacing() {
		findNum();
		System.out.print(input.replace(findStr, replaceStr) + "\n");
	}
	
	void getInput() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요\n--> ");
		this.input = s.nextLine();
		
		System.out.print("찾을 문자열을 입력하세요\n--> ");
		this.findStr = s.nextLine();
		
		System.out.print("바꿀 문자열을 입력하세요\n--> ");
		this.replaceStr = s.nextLine();
		
		System.out.println("");
	}
	
	void findNum() {
		int count = 0;
		int index;
		int f_length = findStr.length();
		
		for(int i = 0; i < input.length(); i++) {
			index = input.indexOf(findStr, i);
			if(index != -1) {
				i = index + f_length;
				if(i > input.length())
					i = input.length();
				count ++;
			}
		}
		
		System.out.println("--> 총 " + count + "번 바뀌었습니다");
	}
}
