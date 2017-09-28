import java.io.*;

class Assignment2
{
  static int[] row;
  public static void main(String[] args)
  {
    readFile();
    System.out.println(largest);
  }

  public static void readFile()
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int i = 0;
    row = new int[20];

    try
    {
      while ((line = br.readLine()) != null)
      {
        //add way to go through the numbers

      }
      br.close();
    } catch (Exception e) {}
  }

  public static int compute()
  {
    int largest = 0;
    int test = 0;

    for(int i = 0; i + 3 < row.length; i++)
    {
      test = row[i] + row[i + 1] + row[i + 2] + row[i + 3]
      if(test > largest)
        largest = test;
    }
    return largest;
  }
}
