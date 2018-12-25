package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class H02 {
	private int lotto[] = new int[6];
	private int count;
	private String onemore;
	
	public H02() {
		getLotto();
	}
	
	void getLotto() {
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			for(int i = 0; i < 6; i++)
				lotto[i] = rand.nextInt(45) + 1;
		
			System.out.print("생성된 로또 번호는 ");
			for(int i = 0; i < 6; i++)
				System.out.print(lotto[i] + " ");
			System.out.println("입니다");
			
			System.out.print("더 만드시겠습니까(Y/N)? ");
			this.onemore = s.next();
			
			if(onemore.compareToIgnoreCase("N") == 0)
				break;
		}
	}
}
