package pl.put.poznan.sortingmadness.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
    public ArrayList<ArrayList<String>> sortNested(ArrayList<ArrayList<String>> list, int noIter, int column)
    {
        Map<String,  ArrayList<ArrayList<String>>> hm = new HashMap<String,  ArrayList<ArrayList<String>>>();
        for(int i=0;i<list.size(); i++)
        {
            String c = (list.get(i).get(column));
            if(hm.get(c) == null)
                hm.put(c, new  ArrayList<ArrayList<String>>());
            hm.get(c).add(list.get(i));
        }
        String[] keys = hm.keySet().toArray(String[]::new);
        insertionSort(keys, hm.keySet().size(), noIter);
        list = new ArrayList<ArrayList<String>>();
        for(String i : keys)
            list.addAll(hm.get(i));
        System.out.println(list);
        return list;
    }
}