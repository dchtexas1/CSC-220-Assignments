import java.io.*;

class Assignment1
{
    public static void main(String[] args)
    {
        #TODO
    }
    public static void readFile()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int lineNum = 0;
        int[] digits;
        digits = new int[9];

        try
        {
            while ((line = br.readLine()) != null)
            {
                lead = line.charAt(0);
                digits[lead-1]++;
                lineNum++
            }
            br.close();
        } catch (Exception e) {}
    }
}
