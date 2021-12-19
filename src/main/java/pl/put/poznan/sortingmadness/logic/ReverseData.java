package pl.put.poznan.sortingmadness.logic;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseData {
    public ArrayList<String> reverseSimple(ArrayList<String> data) {
        Collections.reverse(data);
        return data;
    }

    public ArrayList<ArrayList<String>> reverseNested(ArrayList<ArrayList<String>> data) {
        for (ArrayList<String> x: data) {
            reverseSimple(x);
        }
        return data;
    }

}
