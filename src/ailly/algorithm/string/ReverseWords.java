package ailly.algorithm.string;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {

  private static String reverseWords(String s) {
    String[] words = s.trim().split(" +");
    Collections.reverse(Arrays.asList(words));
    return String.join(" ", words);
  }

  private static String reverseWordsTwoPointers(String s) {
    if (s == null) {
      return null;
    }
    char[] arr = s.toCharArray();
    int n = arr.length;

    // step 1. reverse the whole string
    reverse(arr, 0, n - 1);
    // step 2. reverse each word
    reverseWords(arr, n);
    // step 3. clean up spaces
    return cleanSpaces(arr, n);
  }

  private static void reverseWords(char[] a, int n) {
    int i = 0, j = 0;

    while (i < n) {
      while (i < j || i < n && a[i] == ' ') i++; // skip spaces
      while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
      reverse(a, i, j - 1);                      // reverse the word
    }
  }

  private static void reverse(char[] a, int i, int j) {
    while (i < j) {
      char t = a[i];
      a[i++] = a[j];
      a[j--] = t;
    }
  }

  static String cleanSpaces(char[] a, int n) {
    int i = 0, j = 0;

    while (j < n) {
      while (j < n && a[j] == ' ') j++;             // skip spaces
      while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
      while (j < n && a[j] == ' ') j++;             // skip spaces
      if (j < n) a[i++] = ' ';                      // keep only one space
    }

    return new String(a).substring(0, i);
  }

  public static void main(String[] args) {
    String input = "the sky is blue";
    System.out.println(reverseWordsTwoPointers(input));
  }
}
