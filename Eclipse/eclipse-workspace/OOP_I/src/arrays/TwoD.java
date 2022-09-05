package arrays;

public class TwoD {

	public static void main(String[] args) {
		int table[][]=new int[3][4];
		int i,j;
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				table[i][j]=2*i+1;
				System.out.println("Table["+i+"]["+j+"]: "+table[i][j]);
			}
		}
	}

}
