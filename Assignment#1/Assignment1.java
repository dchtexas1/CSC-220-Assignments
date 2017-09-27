import java.io.*;

class Assignment1
{
    static int[] digits;
    public static void main(String[] args)
    {
        readFile();
        compute();
        printArray();

    }
    public static void readFile()
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
        String line = "--------------------------------";
        String line2 = "================================";
        String lead;
        String pct;
        System.out.printf("%s %n %-19s %1s %n %s %n", line, "Leading Digit\tCount", "\t %", line);

        for(int i = 0; i < digits.length; i++)
        {
            lead = i + "\t\t" + digits[i];
            pct = "\t" + compute()[i] + "%";
            System.out.printf("%s %s %6.2f %-1s %n", lead, "\t", compute()[i], "%");
        }
        System.out.println("--------------------------------");
        System.out.println("Total\t\t"+total()+"\t100.00%");
        System.out.println("================================");
        System.out.println();
    }
}
