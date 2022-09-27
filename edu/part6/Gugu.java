package edu.part6;

public class Gugu {

	public int dan;

	public Gugu(int dan) { //생성자 
		this.dan = dan;
	}

public void printGugudan() {
	for(int i = 2 ; i < 10 ; i += dan) {

		for(int j = 1 ; j < 10 ; j++) {

			for (int k = 0 ; k < dan ; k++) {
				if (10 <= i+k) {
					System.out.print("\n");
					break;
				}
				System.out.printf("%d*%d=%d", (i+k), j, (i+k)*j);

				if (k < dan -1)	System.out.print("\t");

				else			System.out.print("\n");

			}

		}
		System.out.println();
	}
}
}
	
	
	


