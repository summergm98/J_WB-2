package workbook.StepJ;

import java.util.Scanner;

public class J01 {
	private int total;
	private int count[] = {0, 0, 0, 0, 0, 0};
	private int birth_year;
	
	public J01() {
		total = 0;
		Scanner s = new Scanner(System.in);
			
		while(true) {
			System.out.print((total + 1) + "번째 사람이 태어난 년도를 입력하세요: ");
			this.birth_year = s.nextInt();
			
			if(birth_year > 2018)
				break;
			
			count[AskAge(birth_year)] ++;
		}
		
		System.out.println("유아는 " + count[0] + "명 입니다");
		System.out.println("어린이는 " + count[1] + "명 입니다");
		System.out.println("청소년은 " + count[2] + "명 입니다");
		System.out.println("청년은 " + count[3] + "명 입니다");
		System.out.println("중년은 " + count[4] + "명 입니다");
		System.out.println("노년은 " + count[5] + "명 입니다");
	}
	
	int AskAge(int birthyear) {
		
		int age = 2018 - birthyear + 1;
		
		System.out.println("나이는 " + age + " 입니다");
		
		if(age < 7) {
			total++;
			return 0; // 0 유아
		}else if(age >= 7 && age < 13) {
			total++;
			return 1; // 1 어린이
		}else if(age >= 13 && age < 20) {
			total++;
			return 2; // 2 청소년
		}else if(age >= 20 && age < 30) {
			total++;
			return 3; // 3 청년
		}else if(age >= 30 && age < 60) {
			total++;
			return 4; // 4 중년
		}else if(age >= 60) {
			total++;
			return 5; // 5 노년
		}
		return -1; // 에러
	}
}
