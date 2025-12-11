/* Given a paragraph from a data file (“text.txt”), create three static methods to find 
the word count, longest word, and shortest word in each line of the paragraph. */

import java.io.*;
import java.util.*;

public class WordTools {
    public static final String DATA_FILENAME = "text.txt";
    public static void main(String[] args) throws FileNotFoundException {
        wordCount(DATA_FILENAME);
        shortestWord(DATA_FILENAME);
        longestWord(DATA_FILENAME);
    }

    public static void wordCount(String filename) throws FileNotFoundException {
      /* implement a static method to find the word count of each line
        of the paragraph */


      // For each line, print the line number and word count.
      // ex. "Line 1 has 5 words."
    }

    public static void shortestWord(String filename) throws FileNotFoundException {
      /* implement a static method to find the shortest word of each line
        of the paragraph */


      // For each line, print the line number and shortest word.
      // ex. "Line 4's shortest word is: bagel"
    }

    public static void longestWord(String filename) throws FileNotFoundException {
      /* implement a static method to find the longest word of each line
      of the paragraph */


      // For each line, print the line number and longest word.
      // ex. "Line 2's longest word is: mozzarella"
    }
