package edu.part4;

public class Random {

	public static void main(String[] args) {

		int a[][] = new int[2][3]; // 2 X 3 배열 a 생성

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int n = (int) ((Math.random() * 10)); // a 성분 a[i][j]에 0 ~ 10 사이의 난수 저장
				a[i][j] = n;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%d\t", a[i][j]);

			}
			System.out.println();
		}
	}

}
