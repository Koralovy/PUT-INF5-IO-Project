package pl.put.poznan.sortingmadness.logic;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort implements SortingStrategy {
    private static void ss(String arr[], int noIter){
        int len = arr.length;
        for (int i = 0; i < len-1 && (i < noIter || noIter == -1); i++)
        {
            int min = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j].compareTo(arr[min]) < 0)
                    min = j;
            String temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    @Override
    public ArrayList<String> sortSimple(ArrayList<String> list, int noIter)
    {
        String[] arr = list.toArray(new String[0]);
        ss(arr, noIter);
        list = new ArrayList<String>();
        Collections.addAll(list, arr);
        return list;

    }
    @Override
    public ArrayList<ArrayList<String>> sortNested(ArrayList<ArrayList<String>> list, int noIter, int column)
    {
        return new ArrayList<ArrayList<String>>();
    }
}
