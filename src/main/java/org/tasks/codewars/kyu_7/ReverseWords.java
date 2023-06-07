package org.tasks.codewars.kyu_7;
/**
 Complete the function that accepts a string parameter, and reverses each word in the string.
 All spaces in the string should be retained.

 Examples
 "This is an example!" ==> "sihT si na !elpmaxe"
 "double  spaces"      ==> "elbuod  secaps"
 */
public class ReverseWords
{
  public static String reverseWords(final String original) {
    String[] split = original.split(" ");
    int i = 0;
    for(String str : split) {
      split[i] = new StringBuilder(str).reverse().toString();
      i++;
    }
    return String.join(" ", split);

  }
}