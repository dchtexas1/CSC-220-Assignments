public class Hanoi
{
	public static void main(String [] args)
	{
		long startTime = System.nanoTime();
		Hanoi(5, 'A', 'B', 'C');
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("Duration = " + (duration / 1000000000) + " seconds");
	}
	public static void Hanoi(int n, char from, char spare, char to)
	{
		if(n == 1)
		{
			System.out.println(from + " -> " + to);
		}
		else
		{
			Hanoi(n-1, from, to, spare);
			Hanoi(1, from, spare, to);
			Hanoi(n-1, spare, from, to);
		}
	}
}
