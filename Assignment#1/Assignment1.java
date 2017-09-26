import java.io.*;
import java.text.DecimalFormat;

class Assignment1
{
    static int[] digits;
    public static void main(String[] args)
    {
        System.out.println(readFile());
        System.out.println(compute());
        printArray();

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
    public static int total()
    {
        int total = 0;
        for (int i=0; i<digits.length; i++)
        {
            total+=digits[i];
        }
        return total;
    }
    public static double[] compute()
    {
        double[] pct;
        pct = new double[10];
        for (int i=0; i<10; i++)
        {
            pct[i] = (double)(digits[i])/(double)(total())*100.00;
        }
        return pct;
    }

    public static void printArray()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("--------------------------------");
        System.out.println("Leading Digit  Count           %");
        System.out.println("--------------------------------");

        for(int i = 0; i < digits.length; i++)
        {
            System.out.println(i + "              "+digits[i]+"              "
            +df.format(compute()[i])+"%");
        }
        System.out.println("--------------------------------");
        System.out.println("Total          " + total() + "     100.00%");
        System.out.println("--------------------------------");
        System.out.println();
    }
}
