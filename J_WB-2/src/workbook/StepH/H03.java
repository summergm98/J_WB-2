package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class H03 {
	private int lotto_com[] = new int[6];
	private int lotto_user[] = new int[6];
	private int count;
	private int match_count;
	
	public H03() {
		makeLotto();
		getNum();
		cmpMatch();
		printMatch();
	}
	
	void makeLotto() {
		Random rand = new Random();
		
		for(int i = 0; i < 6; i++)
			lotto_com[i] = rand.nextInt(45) + 1;
	}
	
	void getNum() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 6; i ++) {
			System.out.print("원하는 " + (i + 1) + "번째 로또 숫자를 입력하세요: ");
			this.lotto_user[i] = s.nextInt();
			
			for(int j = 0; j < i; j++) {
				if(lotto_user[j] == lotto_user[i]) {
					System.out.println("==> 잘못 입력하셨습니다");
					i --;
					break;
				}
			}
		}
		
		System.out.println("\n이번 주의 로또 당첨 번호는 ");
		for(int i = 0; i < 6; i++)
			System.out.print(lotto_com[i] + " ");
		System.out.println("입니다");
	}
	
	void cmpMatch() {
		for(int i = 0; i < 6; i ++) {
			for(int j = 0; j < 6; j ++) {
				if(lotto_com[i] == lotto_user[j])
					match_count++;
			}
		}
	}
	
	void printMatch() {
		System.out.println("일치하는 로또 번호는 " + match_count +"개 입니다.");
	}
}
