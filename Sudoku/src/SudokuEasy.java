public class SudokuEasy extends MySudoku{
	public void showunsolved()
	{
	    int a[][]  =    {{0,0,4,3,5,2,1,7,8},
				         {2,0,0,0,9,0,5,4,6},
				         {0,0,0,0,6,0,9,2,3},
				         {0,0,9,0,8,0,7,3,0},
				         {0,2,0,0,7,0,6,1,0},
			             {0,0,5,0,4,0,8,9,2},
				         {0,0,0,5,1,7,4,6,9},
				         {1,0,0,8,2,0,3,5,7},
				         {0,0,0,0,3,0,2,8,1}};
for(int i = 0;i<9;i++)
{for(int j = 0;j<9;j++)
{System.out.print(a[i][j]+" ");
}System.out.println();
	}
	}
	public void entersolution() 
	{
		System.out.println("Enter YOUR ANSWER HERE");
	}
public void result(int b[][],int c[][]) {
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
