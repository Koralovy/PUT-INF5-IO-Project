package pl.put.poznan.sortingmadness.logic;
import java.util.ArrayList;

public interface SortingStrategy {
    ArrayList<String> sortSimple(ArrayList<String> data, int noIter);
    ArrayList<ArrayList<String>> sortNested(ArrayList<ArrayList<String>> data, int noIter, String column);
}

/*
//HOWTO
public class BubbleSort implements SortingStrategy {
    @Override
    public ArrayList<String> sortSimple(input, 5) {
        System.out.println("Bubble");

    }
}
 */

