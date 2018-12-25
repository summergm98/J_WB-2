package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class H05 {
	private int coins;
	private int number[] = new int[3];
	private int dummy;
	
	public H05() {
		getCoins();
		playingGame();
	}
	
	void getCoins() {
		Scanner s = new Scanner(System.in);
		System.out.print("사용할 코인의 개수를 입력하세요: ");
		this.coins = s.nextInt();
	}
	
	void playingGame() {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int count_game = 1;
		int result = 0;
		
		while(coins != 0) {
			System.out.print("게임 " + count_game + "회 Start! (아무 숫자나 입력하세요) ");
			this.dummy = s.nextInt();
			
			for(int i = 0; i < 3; i++) {
				this.dummy = r.nextInt(9) + 1;
				number[i] = dummy;
			}
			
			System.out.print("게임 결과 : " + number[0] + " " + number[1] + " " + number[2] + " --->");
			result = checkResult(number[0], number[1], number[2]);
			
			if(result == 1) {
				System.out.println("숫자 3개 일치... 코인 4개 증정");
			}else if(result == 2) {
				System.out.println("숫자 2개 일치... 코인 2개 증정");
			}else {
				System.out.println("꽝입니다... 아쉽군요");
			}
			coins--;
			System.out.println("남아있는 코인은 " + coins + "개 입니다.");
			count_game++;
		}
		
		System.out.println("\n 게임 종료!");
	}
	
	int checkResult(int num1, int num2, int num3) {
		if(num1 == num2 && num2 == num3) {
			coins += 4;
			return 1;
		}else if((num1 == num2 && num2 != num3) || (num1 == num3 && num1 != num2) || (num2 == num3 && num1 != num3)) {
			coins += 2;
			return 2;
		}else {
			return 3;
		}
	}
}
