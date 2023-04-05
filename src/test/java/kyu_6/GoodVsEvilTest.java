package kyu_6;

import static org.junit.Assert.*;

import org.example.kyu_6.GoodVsEvil;
import org.junit.Test;

public class GoodVsEvilTest {
  @Test
	public void testEvilWin() {
    assertEquals("Evil should win", "Battle Result: Evil eradicates all trace of Good",
      GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
  }
  
  @Test
	public void testGoodWin() {
    assertEquals("Good should win", "Battle Result: Good triumphs over Evil",
      GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
  }
  
  @Test
	public void testTie() {
    assertEquals("Should be a tie", "Battle Result: No victor on this battle field",
      GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
  }
}