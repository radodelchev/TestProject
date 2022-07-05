package test;

public class factorial {
	public static void main(String[] args) {
		
		//System.out.print(sumFibunachiNum(50));
	}
	
	static int fact(int n) {
		if(n == 1) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	static int sumFibunachiNum(int i) {
		if(i == 2) {
			return 1;
		}
		if(i == 1) {
			return 0;
		}
		return sumFibunachiNum(i-2)+ sumFibunachiNum(i-1);
	}

}
