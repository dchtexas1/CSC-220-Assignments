import java.io.*;

class Assignment2
{
  public static void main(String[] args)
  {
    readFile();
  }

  public static void readFile()
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int i = 0;

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
    for(int i = 0; i < ?; i++)
    {
      //add computation here
      if(test > largest)
        largest = test;
    }
  }

  public static void printArray()
  {

  }

}
