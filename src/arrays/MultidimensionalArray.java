package arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		String[][] data=new String[3][2];
		
		
		//Row
		data[0][0]="User1";
		data[0][1]="Password1";
		
		
		//Row
        data[1][0]="User2";
		data[1][1]="Password2";
		
		
		//Row
	    data[2][0]="User3";
	    data[2][1]="Password3";
				
		for(int r=0; r<3; r++)  //0+1
		{
			for(int c=0; c<2; c++)
			{
				System.out.println(data[r][c]);
		
			}
		}
		
	}

}
