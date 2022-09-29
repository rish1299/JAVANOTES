package irao;

public class Ique_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int[][] dr=new int[3][4]; 
		for(int r=0;r<dr.length;r++)   //dr.length = 3
		{
			for(int c=0;c<dr[r].length;c++) //dr[r].length = 4
				{dr[r][c]=n*100;
				n=n+1;}
		}
		for(int[] ar:dr)
		{
			for(int e:ar)
				System.out.print(e+"\t");
			System.out.println("\n");
		}
	}

}
