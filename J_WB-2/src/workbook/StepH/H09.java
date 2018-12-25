package workbook.StepH;

import java.util.Scanner;

public class H09 {
	private String input;
	private String userList[] = new String[1000];
	private String userInfo[] = new String[1000];
	
	public H09() {
		getInput();
		getUser();
	}
	
	void getInput() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요\n--> ");
		this.input = s.nextLine();
	}
	
	void getUser() {
		String[] dummy;
		int count = 0;
		dummy = input.split("###");
		
		for(int i = 0; i < dummy.length; i++) {
			count++;
			getInfo(dummy[i], i);
		}
		
		System.out.println("--> 총  " + count + "명이 등록되었습니다");
		
		for(int i = 0; i < count; i++) {
			System.out.println("--> " + userList[i] + " " + userInfo[i]);
		}
	}
	
	void getInfo(String user, int n) {
		int index = user.indexOf("|");
		
		userList[n] = user.substring(0, index);
		userInfo[n] = user.substring(index + 1, user.length());
	}
}
