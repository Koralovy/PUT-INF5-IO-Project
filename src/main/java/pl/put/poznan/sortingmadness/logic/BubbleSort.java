package pl.put.poznan.sortingmadness.logic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


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
        Map<String,  ArrayList<ArrayList<String>>> hm = new HashMap<String,  ArrayList<ArrayList<String>>>();
        for(int i=0;i<list.size(); i++)
        {
            String c = (list.get(i).get(column));
            if(hm.get(c) == null)
                hm.put(c, new  ArrayList<ArrayList<String>>());
            hm.get(c).add(list.get(i));
        }
        String[] keys = hm.keySet().toArray(String[]::new);
        bubbleSort(keys, hm.keySet().size(), noIter);
        list = new ArrayList<ArrayList<String>>();
        for(String i : keys)
            list.addAll(hm.get(i));
        System.out.println(list);
        return list;
    }
}
