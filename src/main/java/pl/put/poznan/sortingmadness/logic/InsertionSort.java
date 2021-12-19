package pl.put.poznan.sortingmadness.logic;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort implements SortingStrategy {
    @Override
    public ArrayList<String> sortSimple(ArrayList<String> list, int noIter) {
        String[] arr = list.toArray(new String[0]);
        insertionSort(arr, arr.length, noIter);
        list = new ArrayList<String>();
        Collections.addAll(list, arr);
        return list;
    }

    private static void insertionSort(String array[], int arrLen, int breakpoint) {
        int noIter = 0;
        String temp = "";
        for (int i = 0; i < arrLen; i++) {
            if (noIter == breakpoint) {
                return;
            } else {
                for (int j = i + 1; j < arrLen; j++) {
                    if (array[i].compareToIgnoreCase(array[j]) > 0) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
                noIter += 1;
            }
        }
    }
    @Override
    public ArrayList<ArrayList<String>> sortNested(ArrayList<ArrayList<String>> list, int noIter, String column)
    {
        return new ArrayList<ArrayList<String>>();
    }
}