package workbook.StepF;

import java.util.Scanner;

public class F01 {
	private int[] num = new int[10];
	private int[] newArray = new int[10];
	private int first, second;
	private int second_max_index;
	private int newnum;
	private int i;
	
	public F01() {
		getArray();
		sortArray();
	}
	
	public void printR() {
		getSecond();
		System.out.print("�� ��°�� ū ���� " + second_max_index + " ��° �� " + second + " �Դϴ�.\n");
	}
	
	void getArray() {
		Scanner s = new Scanner(System.in);
		for(i = 0; i < num.length; i++) {
			System.out.printf("%d��° ���� �Է��ϼ���: ", i+1);
			this.num[i] = s.nextInt();
		}
	}

	void sortArray() {	
		
		for(int i = 0; i < num.length; i++) {
			newArray[i] = num[i];
		}
		
		for(int n = 0; n < newArray.length; n++) {
			for(int m = 0; m < n; m++) {
				if(newArray[n] < newArray[m]) {
					int temp = newArray[n];
					newArray[n] = newArray[m];
					newArray[m] = temp;
				}
			}
		}
	}
	
	void getSecond() {
		first = newArray[newArray.length - 1];
		second = newArray[newArray.length - 2];
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] == second) {
				second_max_index = i + 1;
				return;
			}
		}
	}
}
