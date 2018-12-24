package workbook.StepG;

import java.util.Scanner;

public class G01 {
	private int birth_year;
	private int age[] = new int[100];
	private int count_person, count_baby, count_child, count_youth, count_young, count_adult, count_old;
	
	public G01() {
		count_person = 0;
		count_baby = 0;
		count_child = 0;
		count_youth = 0;
		count_young = 0;
		count_adult = 0;
		count_old = 0;
		
		getBirth_year();
	}
	
	public void printAge() {
		for(int i = 0; i < count_person; i++) {
			System.out.printf("%d번째 사람의 나이는 %d 입니다\n" ,i + 1, age[i]);
		}
	}
	
	public void printAges() {
		System.out.println("유아는 " + count_baby + "명 입니다");
		System.out.println("어린이는 " + count_child + "명 입니다");
		System.out.println("청소년은 " + count_youth + "명 입니다");
		System.out.println("청년은 " + count_young + "명 입니다");
		System.out.println("중년은 " + count_adult + "명 입니다");
		System.out.println("노년은 " + count_old + "명 입니다");
	}
	
	void getBirth_year() {
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			System.out.printf("%d번째 사람의 태어난 년도를 입력하세요 (종료를 원하신다면 2018보다 큰 수를 입력하세요)\n", count_person + 1);
			System.out.print("-->");
			this.birth_year = s.nextInt();
			
			if(birth_year > 2018)
				break;
			
			getAge(birth_year, count_person);
			count_person++;
		}		
	}
	
	void getAge(int birth_year, int n) {
		age[n] = 2018 - birth_year + 1;
		
		if(age[n] < 7)
			count_baby++;
		else if(age[n] >= 7 && age[n] < 13)
			count_child++;
		else if(age[n] >= 13 && age[n] < 20)
			count_youth++;
		else if(age[n] >= 20 && age[n] < 30)
			count_young++;
		else if(age[n] >= 30 && age[n] < 60)
			count_adult++;
		else if(age[n] >= 60)
			count_old++;
	}
}
