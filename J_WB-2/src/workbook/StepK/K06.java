package workbook.StepK;

import java.util.Scanner;

public class K06 {
	public void main() {
		int count = getNum();
		UserInfo user = new UserInfo();
		
		for(int i = 0; i < count; i++)
			user.input();
		
		System.out.println("등록된 학생 목록은 다음과 같습니다");
		System.out.println("----------------------");
		System.out.println("번호 / 아이디 / 비밀번호");
		for(int i = 0; i < count; i++)
			user.print(i);
	}
	
	int getNum() {
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는? ");
		return s.nextInt();
	}
}
