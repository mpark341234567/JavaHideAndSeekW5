package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class FuzzyFinderTest {
    @Test
    void testLinearSearch() {
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> fuzzies = new ArrayList<>();
        fuzzies.add(new Fuzzy("red"));
        fuzzies.add(new Fuzzy("orange")); 
        fuzzies.add(new Fuzzy("yellow"));
        fuzzies.add(new Fuzzy("green"));
        fuzzies.add(new Fuzzy("blue"));
        fuzzies.add(new Fuzzy("indigo"));
        fuzzies.add(new Fuzzy("violet"));
        fuzzies.add(new Fuzzy("gold")); // The target color  
        
        // Test with sorted fuzzies
        assertEquals(7, finder.linearSearch(fuzzies));
        
        fuzzies.clear();
        fuzzies.add(new Fuzzy("red"));
        fuzzies.add(new Fuzzy("yellow"));
        fuzzies.add(new Fuzzy("gold")); // The target color  
        fuzzies.add(new Fuzzy("green"));
        fuzzies.add(new Fuzzy("violet"));
        fuzzies.add(new Fuzzy("blue"));
        fuzzies.add(new Fuzzy("orange")); 
        fuzzies.add(new Fuzzy("indigo"));
        // Test with random fuzzies
        assertEquals(2, finder.linearSearch(fuzzies));
    }
    @Test
    void testBinarySearch() {
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> fuzzies = new ArrayList<>();
        fuzzies.add(new Fuzzy("blue"));
        fuzzies.add(new Fuzzy("gold")); // The target color  
        fuzzies.add(new Fuzzy("green"));
        fuzzies.add(new Fuzzy("indigo"));
        fuzzies.add(new Fuzzy("orange")); 
        fuzzies.add(new Fuzzy("red"));
        fuzzies.add(new Fuzzy("violet"));
        fuzzies.add(new Fuzzy("yellow"));
        // Test with sorted fuzzies
        assertEquals(1, finder.binarySearch(fuzzies));
        
        fuzzies.clear();
        fuzzies.add(new Fuzzy("red"));
        fuzzies.add(new Fuzzy("orange")); 
        fuzzies.add(new Fuzzy("yellow"));
        fuzzies.add(new Fuzzy("green"));
        fuzzies.add(new Fuzzy("blue"));
        fuzzies.add(new Fuzzy("indigo"));
        fuzzies.add(new Fuzzy("violet"));
        fuzzies.add(new Fuzzy("gold")); // The target color  
        // Test with random fuzzies
        assertEquals(-1, finder.binarySearch(fuzzies));
    }
}
