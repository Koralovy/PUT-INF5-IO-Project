package pl.put.poznan.sortingmadness.logic;
import java.util.ArrayList;
import java.util.Collections;


public class BubbleSort implements SortingStrategy {
    @Override
    public ArrayList<String> sortSimple(ArrayList<String> list, int noIter) {
        String[] arr = list.toArray(new String[0]);
        bubbleSort(arr, arr.length, noIter);
        list = new ArrayList<String>();
        Collections.addAll(list, arr);
        return list;        
    }

    private static void bubbleSort(String array[], int arrLen, int breakpoint) {
        String str[] = array;
        String temp;
        int noIter = 0;
        for (int j = 0; j < str.length; j++) {
            if (noIter == breakpoint) {
                return;
            } else {
                for (int i = j + 1; i < str.length; i++) {
                    if (str[i].compareTo(str[j]) < 0) {
                        temp = str[j];
                        str[j] = str[i];
                        str[i] = temp;
                    }
                }
                noIter += 1;
            }
        }
    }
    @Override
    public ArrayList<ArrayList<String>> sortNested(ArrayList<ArrayList<String>> list, int noIter, int column)
    {
        return new ArrayList<ArrayList<String>>();
    }
}
