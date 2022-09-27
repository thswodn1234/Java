package edu.part3;

public class GuGuDan09 {

	public static void main(String[] args) {
		int j = 1;
        while(j < 10){
            
            for(int i = 2; i < 10 ; i++) {
                System.out.printf("%d * %d = %d\t", i, j, i * j);
            }
            System.out.println();
            j++;
        
        }
    }
}

