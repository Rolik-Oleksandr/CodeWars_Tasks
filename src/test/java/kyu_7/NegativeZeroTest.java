package kyu_7;

import org.example.kyu_7.NegativeZero;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NegativeZeroTest {
  private static final Map<Float, Boolean> data = new HashMap<>();

  @BeforeClass
  public static void beforeClass() {
    data.put(-0f, true);
    data.put(0f, false);
    data.put(1f, false);
    data.put(-1f, false);
    data.put(2f, false);
    data.put(-2f, false);
    data.put(3f, false);
    data.put(-3f, false);
    data.put(10f, false);
    data.put(-10f, false);
  }

  @Test
  public void isNegativeZero_checkForFloats() {
    for (Map.Entry<Float, Boolean> entry : data.entrySet()) {
      float input = entry.getKey();
      boolean expected = entry.getValue();
      boolean actual = NegativeZero.isNegativeZero(input);
      Assert.assertEquals(String.format("The result should be %b fot the input number %f\n",
        expected, input), expected, actual);
    }
  }
}