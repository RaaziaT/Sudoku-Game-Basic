public class SudokuIntermediate extends MySudoku {
	public void showunsolved()
	{
		int a[][] = {{0,0,0,0,0,0,8,2,3},
				{0,0,0,8,0,0,9,7,1},
				{0,8,0,2,0,0,5,4,6},
				{0,0,0,0,9,0,0,0,7},
				{0,0,3,0,0,2,4,0,9},
				{8,0,0,0,0,0,2,0,9},
				{1,0,8,6,0,0,0,3,4},
				{0,0,7,0,0,4,1,9,5},
				{0,0,0,0,0,0,6,8,2} };
		for(int i = 0;i<9;i++)
		{for(int j = 0;j<9;j++)
		{System.out.print(a[i][j]+" ");

			}System.out.println();}
		}
		
	public void entersolution() {
		System.out.println("Enter YOUR ANSWER HERE");
		}
    public void result(int b[][],int c[][]) 
	{
		for(int i = 0;i<9;i++)
		{for(int j = 0;j<9;j++)
		{
			if(b[i][j]==c[i][j]);
		}
		}System.out.println("YOU WIN");
	}
}

