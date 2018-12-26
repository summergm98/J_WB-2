package workbook.StepI;

import java.util.Scanner;
import java.util.Random;

public class I06 {
	private int count[] = new int[3];
	
	public I06() {
		System.out.println("10개의 숫자를 생성합니다");
		for(int i = 0; i < 10; i++) {
			int count = GetRandom();
			if(count == 0)
				this.count[0] ++;
			else if(count == 1)
				this.count[1] ++;
			else if(count == 2)
				this.count[2] ++;
		}
		
		System.out.println("\n1. 대 (70 이상) : " + count[0] + "회 생성");
		System.out.println("2. 중 (40 이상) : " + count[1] + "회 생성");
		System.out.println("3. 소 (40 미만) : " + count[2] + "회 생성");
	}
	
	byte GetRandom() {
		byte rand_num = 0;
		Random rand = new Random();
		rand_num = (byte) rand.nextInt(101);
		System.out.println("생성된 임의의 숫자는 " + rand_num + "입니다");
		
		if(rand_num >= 70) {
			return 0;
		}else if(rand_num < 70 && rand_num >= 40) {
			return 1;
		}else {
			return 2;
		}
	}
}
