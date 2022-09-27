package problem;

import java.util.Scanner;

public class GcdLcm {
	int num1;
	int num2;
	
	private void print() {
		// 최소공배수와 최대공약수를 구한다. 유클리드 호제법
		// num1 : a , num2 : b
		int max;
		int min;
		
		if (num1 < num2) {
			max = num2;
			min = num1;
		} else {
			max = num1;
			min = num2;
			
		}
		int rem = max % min;
		while(rem != 0) {
			max = min;
			min = rem;
			rem = max % min;
		}
		if (min == 1) {
			System.out.println("최대공약수 : 서로소");
			System.out.println("최소공배수 : " + (num1 * num2) );
		} else {
		System.out.println("최대공약수 : " + min);
		System.out.println("최소공배수 : " + (num1 * num2) / min);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A : ");
		int a = sc.nextInt();
		System.out.print("B : ");
		int b = sc.nextInt();
		
		GcdLcm gl = new GcdLcm();
		gl.num1 = a;
		gl.num2 = b;
		gl.print();
		sc.close();
	
		
	}

}
