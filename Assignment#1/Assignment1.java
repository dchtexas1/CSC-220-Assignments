import java.io.*;

class Assignment1
{
    public static void main(String[] args)
    {
        System.out.println(readFile());

    }
    public static String readFile()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int[] digits;
        int i = 0;
        digits = new int[9];

        try
        {
            while ((line = br.readLine()) != null)
            {
                char lead = line.charAt(0);
                int n = Character.getNumericValue(lead);
                digits[n-1]++;
            }
            br.close();
        } catch (Exception e) {}
        return (java.util.Arrays.toString(digits));
    }
}
