package kyu_6;

import org.example.kyu_6.ValidPhoneNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PhoneExampleTests {
  @Test
  public void tests() {
    assertEquals(true, ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));
    assertEquals(false, ValidPhoneNumber.validPhoneNumber("(1111)555 2345"));
    assertEquals(false, ValidPhoneNumber.validPhoneNumber("(098) 123 4567"));
  }
}