public class SudukoHard extends MySudoku {
	public void showunsolved()
	{
		int a[][] = {{0,6,0,4,0,0,0,2,0},
				     {0,0,0,0,0,0,0,0,0},
				     {0,0,0,0,8,3,9,7,0},
				     {7,0,3,0,9,0,0,1,5},
				     {6,0,1,3,7,0,2,0,4},
				     {0,0,0,0,0,0,0,8,0},
				     {0,3,0,0,0,8,0,0,0},
				     {0,0,5,0,0,7,1,0,2},
				     {0,0,0,0,0,0,0,0,9}};
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
		 int k=0;
			for(int i = 0;i<9;i++)
			{for(int j = 0;j<9;j++)
			{
				if(b[i][j]==c[i][j])
					continue;
				else
					k++;
			}
			}
			if(k==0)
			System.out.println("YOU WIN");
			else
				System.out.println("YOU LOSS");
		}
}
