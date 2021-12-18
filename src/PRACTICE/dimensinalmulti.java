package PRACTICE;

public class dimensinalmulti {

	public static void main(String[] args) {
		int[][] a ;	
		a =new int [3] [2];

		a[0][0]=10;
		a[0][1]=20;
		
		
		a[1][0]=10;
		a[1][1]=20;
	
		a[2][0]=10;
		a[2][1]=20;
	
		for( int i=0; i<a.length; i++)
		{
			for ( int j=0; j<a[i].length; j++)
			{
				System.out.println(a[i][j]);
			}
	}
	}
}


