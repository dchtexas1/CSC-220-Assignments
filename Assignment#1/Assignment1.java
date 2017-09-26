import java.io.*;

class Assignment1
{
    static int[] digits;
    public static void main(String[] args)
    {
        //System.out.println(readFile());
        //System.out.println(compute());

    }
    public static String readFile()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int i = 0;
        digits = new int[10];

        try
        {
            while ((line = br.readLine()) != null)
            {
                char lead = line.charAt(0);
                int n = Character.getNumericValue(lead);
                digits[n]++;
            }
            br.close();
        } catch (Exception e) {}
        return (java.util.Arrays.toString(digits));
    }
    public static String compute()
    {
        for (int i=0; i<10; i++)
        {
            double[] pct;
            pct = new double[10];
            int total = 0;
            for (int j=0; i<digits.length; j++)
            {
                total+=digits[i];
            }
            for (int j=0; i<10; j++)
            {
                digits[i]/total*100 = pct[i];
            }
        }
        return (java.util.Arrays.toString(pct));
    }

    public static void printArray()
    {
      System.out.println("--------------------------------");
      System.out.println("Leading Digit  Count           %");
      System.out.println("--------------------------------");

      for(int i = 0; i < digits.length; i++)
        System.out.println(i + "     " + digits[i] + "    " + pct[i]);

      System.out.println("--------------------------------");
      System.out.println("Total        " + total + "     100.00%");
      System.out.println("--------------------------------");
      System.out.println();
    }
}
