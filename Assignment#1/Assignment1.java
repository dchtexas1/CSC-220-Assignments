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
        int i = 0;
        digits = new int[9];

        try
        {
            while ((line = br.readLine()) != null)
            {
                lead = line.charAt(0);
                digits[lead-1]++;
                //do we need to initialize the values in each index first?
                lineNum++

                for(int i = 0; j < line.length(); i++)
                    file[i] = (line.charAt(i) == 'idk')
            }
            br.close();
        } catch (Exception e) {}
    }
}
