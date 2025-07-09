package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
      FuzzyListGenerator generator = new FuzzyListGenerator();
      FuzzyFinder finder = new FuzzyFinder();
 
      ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
      ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
 
      int testOne = finder.linearSearch(sortedFuzzies);
      System.out.println("Linear Search on Sorted Fuzzies: " + testOne);
     
      int testTwo = finder.binarySearch(sortedFuzzies);
      System.out.println("Binary Search on Sorted Fuzzies: " + testTwo);
      
      int testThree = finder.linearSearch(randomFuzzies);
      System.out.println("Linear Search on Random Fuzzies: " + testThree);

      int testFour = finder.binarySearch(randomFuzzies);
      if (testFour == -1) {
          System.out.println("Binary Search on Random Fuzzies: Not Found");
      } else {
          System.out.println("Binary Search on Random Fuzzies: " + testFour);
      }
}
}