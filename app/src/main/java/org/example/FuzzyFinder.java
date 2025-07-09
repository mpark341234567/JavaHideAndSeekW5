package org.example;

import java.util.ArrayList;

public class FuzzyFinder {
    public int linearSearch(ArrayList<Fuzzy> fuzzies) {
        for (Fuzzy fuzzy : fuzzies) {
            if (fuzzy.color.equals("gold")) {
                return fuzzies.indexOf(fuzzy);
            }
        }
        return -1;
    }

    public int binarySearch(ArrayList<Fuzzy> fuzzies) {
        int first = 0;
        int last = fuzzies.size() - 1;
        int mid = (last + first) / 2;
        while (first <= last) {
            if (fuzzies.get(mid).color.equals("gold")) {
                return mid; // returns the index of the found element
            } else if ((fuzzies.get(mid).color).compareTo("gold") > 0) {// check if "gold" is greater than the mid element
                last = mid - 1; // search in the left half
            } else {
                first = mid + 1; // search in the right half
            }
            mid = (last + first) / 2; // recalculate mid
        }
        return -1;
    }
}
