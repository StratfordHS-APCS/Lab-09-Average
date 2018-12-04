import java.util.Scanner;
import java.io.IOException;
import java.io.File;

/**
 * 
 * @author (your name)
 * @version (date)
 */
public class Average
{
    public static double getAverage(String line)
    {
        // "line" holds a single line from the file
        // Hint: Integer.MAX_VALUE is the largest integer
        double average;

        // make a new Scanner with "line" as the source
        // read each integer and process them

        return average;
    }

    public static void main( String args[] ) throws IOException
    {
        // create a new Scanner with the file "average.txt" as the source.
        
        // the file only contains lines of data. there is no first line with the number of data lines.
        // you will probably want to use a while loop to go through the file.
        // Hint: Scanner.hasNext() returns true when there is another line available to read.

            // Here is a line to output the averages.
            System.out.println("average = " + String.format("%.2f",getAverage(line))+"\n\n");
        
    }
}