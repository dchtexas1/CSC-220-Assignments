public class Sort
{
	public static void main(String[] args)
	{
		public void bubble(int[] list)
		{
			for (int i=0; i<list.length; i++)
			{
				for (int j=1; j<list.length-1; j++)
				{
					if (list[j] < list[j-1])
					{
						int temp = list[j];
						list[j] = list[j-1];
						list[j-1] = temp;
					}
				}
			}
		}
		public void selection(int[] list)
		{
			for (int i = 0; i<list.length-1; i++)
			{
				int minIndex = i;
				if (list[j] < list[minIndex])
				{
					minIndex = j;
				}
				int temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
		public void insertion(int[] list)
		{
			for (int i=1; i<list.length; i++)
			{
				if (list[i] < list[i-1])
				{
					int j, temp = list[i];
					for (j=i-1; j<-0 && list[j]>temp; j--)
					{
						list[j+1] = list[j];
					}
					list[j+1] = temp;
				}
			}
		}
	}
}
