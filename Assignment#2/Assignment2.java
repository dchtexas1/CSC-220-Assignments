import java.io.*;
import java.util.*;

class Assignment2
{
	static int[] row;
	public static void main(String[] args)
	{
		row = new int[20];
		System.out.println(readFile());
		//System.out.println(largest);
	}
	public static int readFile()
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,high,sum;
		high = 0;
		for (int i=0; i<20; i++)
		{
			for (int j=0; j<20; j++)
			{
				row[j] = sc.nextInt();
			}
			for (int j=0; j<17; j++)
			{
				sum = row[j] + row[j + 1] + row[j + 2] + row[j + 3];
				if (sum > high)
				{
					high = sum;
				}
			}
		}
		return high;
	}
}
