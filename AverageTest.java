import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AverageTest.
 *
 * @author  Dave Avis
 * @version 12.3.2018
 */
public class AverageTest
{
    /**
     * Testing the getAverage method.
     */
    @Test(timeout=2000)
    public void getAverageTest()
    {
        String[] inputs = {
                "9 10 5 20 100 100 100 90 80 84",
                "11 22 33 44 55 66 77 85 75 62",
                "48 52 29 100 50 29 70 80 90 70",
                "0 100 100 90 85 67 85 48 38 49",
                "100 90 95 98 100 97",
                "100 90 100 100 100 100",
                "100 100 100 100 100 100 100 100 0",
                "90 80 90 80 60"
            };
        double[] expected = { 65.89, 57.67, 65.44, 73.56, 98.00, 100.00, 100.00, 85.00 };
        
        for( int i = 0; i < inputs.length; i++ )
        {
            assertEquals("Failed with data \"" + inputs[i] + "\":", expected[i], Average.getAverage(inputs[i]), 0.1);
        }
    }
}
