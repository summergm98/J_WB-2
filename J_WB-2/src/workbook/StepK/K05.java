package workbook.StepK;

import java.util.Scanner;

class UserInfo{
	private String[] id = new String[100];
	private String[] password = new String[100];
	private int count = 0;
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("학생의 아이디, 비밀번호를 입력하세요: ");
		this.id[count] = s.next();
		this.password[count] = s.next();
		count++;
	}
	
	void print(int index) {		
		System.out.println((index + 1) + " / " + id[index] + " / " + password[index]);
	}
}

public class K05 {
	public void main() {
		UserInfo user = new UserInfo();
		user.input();
		
		System.out.println("등록된 학생 목록은 다음과 같습니다");
		System.out.println("----------------------");
		System.out.println("번호 / 아이디 / 비밀번호");
		user.print(0);
	}
}
