package workbook.StepH;

import java.util.Scanner; 
import java.util.Random;

public class H01 {
	private int answer;
	private int number_try;
	private int count;
	
	public H01() {
		Random rand = new Random();
		answer = rand.nextInt(100) + 1;
		guess();
	}
	
	void guess() {
		Scanner s = new Scanner(System.in);
		count = 0;
		
		while(true) {
			System.out.print("1부터 100까지의 숫자 하나를 맞춰보세요 : ");
			this.number_try = s.nextInt();
			count++;
			if(number_try < answer)
				System.out.println("좀 더 큰 수입니다");
			else if(number_try > answer)
				System.out.println("좀 더 작은 수입니다");
			else if(number_try == answer) {
				System.out.println(count + "번 만에 숫자를 맞추셨습니다");
				break;
			}
		}
	}
}
