import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MultiplesOfN {
    @Test
    public void tests() {
      Assert.assertArrayEquals(new int[] {5, 10, 15}, org.example.kyu_7.MultiplesOfN.multiples(3, 5));
    }
}