public class One
{
	public static void main(String[] args)
	{
		String s = "";
		System.out.println(F(5));
		System.out.println(F2(0, 5));
		System.out.println(F3(5));
		System.out.println(F4(352));
		System.out.println(F5(5));
		System.out.println(F6(985161554, s));
	}

	static int F(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		return n + F(n - 1);
	}

	static int F2(double x, int n)
	{
		if (n == 0)
		{
			return 0;
		}
		return n + F2(x, n-1);
	}

	static int F3(int n)
	{
		if (n < 2)
		{
			return 0;
		}
		return 1 + F3(n / 2);
	}

	static int F4(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		return F4(n / 10) + n % 10;
	}

	static int F5(int n)
	{
		if (n < 0)
		{
			return F5(-n);
		}
		if (n < 10)
		{
			return n;
		}
		return F5(n / 10);

	}

	static String F6(int n, String s)
	{
		int x = n%10;
		if (n == 0)
		{
			return s;
		}
		s += x;
		return F6(n / 10, s);
	}
}
