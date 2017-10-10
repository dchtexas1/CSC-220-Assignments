public class Search
{
	public static void main(String[] args)
	{
		public int search(int[] arr, int key)
		{
			int first = 0;
			int last = arr.length - 1;
			int mid;

			while (first <= last)
			{
				mid = (last + first) / 2;
				if (arr[mid] == key)
				{
					return mid;
				}
				if (arr[mid] > key)
				{
					last = mid - 1;
				}
				else
				{
					first = mid + 1;
				}
			}
			return -1;
		}
	}
}
