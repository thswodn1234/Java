package problem;

/* 
 최대공약수 & 최소공배수
 두 개의 정수를 입력 받아서 최대공약수와 최소공배수를 구해서 출력
 - 유클리드 호제법
 	1. 입력 받은 두개의 정수 중 큰 정수를 max, 작은 정수를 min
 	2. max % min = rem
 	3. rem이 0이면
 	 	=> 최대공약수 = 작은 정수, 최소공배수 = 두 정수의 곱 / 최대공약수
 	4. rem이 0이 아니면
 		=> max = min, min = rem 2번 반복
*/

import java.util.Scanner;

public class Euclid {

	public void Euclidian(int a, int b) {

		int max, min, rem;

		if (a > b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}

		do {
			rem = max % min;
			if (rem == 0)
				break;
			max = min;
			min = rem;
		} while (rem != 0);

		System.out.printf("%d\t %d", min, (a * b) / min);

	}

	public static void main(String[] args) {
		int a, b;

		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();

		Euclid e = new Euclid();
		e.Euclidian(a, b);
		s.close();
	}

}
