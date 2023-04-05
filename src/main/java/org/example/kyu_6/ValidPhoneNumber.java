package org.example.kyu_6;

public class ValidPhoneNumber {
  public static boolean validPhoneNumber(String phoneNumber) {
    return phoneNumber.charAt(0) == '('
            && phoneNumber.charAt(4) == ')'
            && phoneNumber.charAt(9) == '-';
  }
}