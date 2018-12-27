package workbook.StepJ;

public class J10 {
	private double num1, num2;
	private int count;
	
	public J10() {
		num1 = 10;
		num2 = 10;
		count = 2;
		
		while(true) {
			
			System.out.print(count + "번째 비율");
			num2 = getGolden(count);
			count++;
			
			if(num1 > num2) {
				if(num1 - num2 < 0.000001)
					break;
			}else if(num2 > num1) {
				if(num2 - num1 < 0.000001)
					break;
			}
		}
	}
	
	int fibonacci(int n) {
		if(n == 1 || n == 2)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	double getGolden(int n) {
		num1 = num2;
		num2 = (double) fibonacci(n + 1) / (double) fibonacci(n);
		num2 = Double.parseDouble(String.format("%.6f", num2));
		
		System.out.print("(" + fibonacci(n + 1) + " , " + fibonacci(n) + "): " + num2 + "\n");
		return num2;
	}
}
