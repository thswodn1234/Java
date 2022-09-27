package edu.part4;

public class product {

	public static void main(String[] args) {

		int a[][] = new int[2][3]; // 2 X 3 배열 a 생성
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int n = (int) ((Math.random() * 10));
				a[i][j] = n;
			}
		}

		System.out.println("행렬 a");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		int d[][] = new int[3][4]; // 3 X 4 배열 d 생성

		for (int x1 = 0; x1 < d.length; x1++) {
			for (int y1 = 0; y1 < d[x1].length; y1++) {
				int v3 = (int) ((Math.random() * 10));
				d[x1][y1] = v3;
			}
		}

		// 행렬 d 출력
		System.out.println("행렬 d");
		for (int m = 0; m < d.length; m++) {
			for (int n = 0; n < d[m].length; n++) {
				System.out.printf("%d\t", d[m][n]);
			}
			System.out.println();
		}
		System.out.println();

		int e[][] = new int[2][4]; // 2 X 4 배열 e 생성

		// 행렬 e = 2 X 3 (행렬 a) * 3 X 4 (행렬 d)

		for (int h = 0; h < a.length; h++) {
			for (int o = 0; o < d[0].length; o++) {
				int result = 0;
				for (int z = 0; z < a[0].length; z++) {
					System.out.println("h = " + h + " o = " + o + " z = " + z);
					result += a[h][z] * d[z][o];
				}
				System.out.println("result = " + result);
				e[h][o] = result;

			}

		}
		// 행렬 e = a * d 출력
		System.out.println("행렬 e = a * d");
		for (int x2 = 0; x2 < a.length; x2++) {
			for (int y2 = 0; y2 < d[0].length; y2++) {
				System.out.printf("%d\t", e[x2][y2]);
			}
			System.out.println();
		}
	}
}
