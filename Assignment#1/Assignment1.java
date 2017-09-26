import java.io.*;

class Assignment1
{
    public static void main(String[] args)
    {
        //System.out.println(readFile());
        //System.out.println(compute());

    }
    public static String readFile()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int[] digits;
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
            int[] pct;
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
}
