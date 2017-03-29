import java.util.*;
public class GameBegins {
	public static void main(String[] args)
{ 
Scanner ok = new Scanner(System.in);
SudokuEasy SE =new SudokuEasy();
SudokuMedium SI= new SudokuMedium();
SudukoHard SH = new SudukoHard();
System.out.println("Hey fellas! Lets Play Sudoku\n Rules are listed Below:\n1. Number can appear only once on each row\n2. Number can appear only once on each column");
System.out.println("Now Select Your level:\nPress 1 for EASY\nPress 2 for Medium\nPress 3 for Hard");
switch(ok.nextInt()){
case 1:
{
	SE.showunsolved();
    SE.entersolution();
int[][] c = new int[9][9];
int b[][]  =   {{9,6,4,3,5,2,1,7,8},
        {2,8,3,7,9,1,5,4,6},
        {7,5,1,4,6,8,9,2,3},
        {6,1,9,2,8,5,7,3,4},
        {4,2,8,9,7,3,6,1,5},
        {3,7,5,1,4,6,8,9,2},
        {8,3,2,5,1,7,4,6,9},
        {1,9,6,8,2,4,3,5,7},
        {5,4,7,6,3,9,2,8,1}};
for(int i = 0;i<9;i++)
{for(int j = 0;j<9;j++)
{
	 c[i][j]=ok.nextInt();
}
}	
SE.result(c, b);
}
break;
case 2:
{
	SI.showunsolved();
	SI.entersolution();
	int b[][] ={{7,4,6,9,1,5,8,2,3},
			{3,2,5,8,4,6,9,7,1},
			{9,8,1,2,7,3,5,4,6},
			{6,1,2,4,9,8,3,5,7},
			{5,9,3,7,6,2,4,1,8},
			{8,7,4,5,3,1,2,6,9},
			{1,5,8,6,2,9,7,3,4},
			{2,6,7,3,8,4,1,9,5},
			{4,3,9,1,5,7,6,8,2}};
	int[][] c= new int[9][9];
	for(int i = 0;i<9;i++)
	{for(int j = 0;j<9;j++)
	{
		 c[i][j]=ok.nextInt();
	}
	}	
	SI.result(c, b);
	
}
break;
case 3:
{
	SH.showunsolved();
	SH.entersolution();
	int b[][] = {{9,6,7,4,5,1,3,2,8},
			     {3,2,8,7,6,9,4,5,1},
			     {5,1,4,2,8,3,9,7,6},
			     {7,4,3,8,9,2,6,1,5},
			     {6,8,1,3,7,5,2,9,4},
			     {2,5,9,1,4,6,7,8,3},
			     {4,3,2,9,1,8,5,6,7},
			     {8,9,5,6,3,7,1,4,2},
			     {1,7,6,5,2,4,8,3,9}};
	int[][] c = new int[9][9];
	for(int i = 0;i<9;i++)
	{for(int j = 0;j<9;j++)
	{
		 c[i][j]=ok.nextInt();
	}
	}	
	SH.result(c,b);
}
break;
default:
{System.out.println("Invalid Option");}
}
}
}