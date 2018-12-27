package workbook.StepJ;

public class J06 {
	private int fibo;
	
	public J06() {
		for(int i = 1; i <= 20; i ++) {
			fibo = fibonacci(i);
			System.out.println(i + "번째  : " +  fibo);
		}
	}
	
	int fibonacci(int n) {
		if(n == 1 || n == 2)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
