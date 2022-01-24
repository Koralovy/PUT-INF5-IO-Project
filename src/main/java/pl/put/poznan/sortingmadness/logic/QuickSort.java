package pl.put.poznan.sortingmadness.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class QuickSort implements SortingStrategy {

    private static int partition(String array[], int b, int e)
    {
        String pivot = array[e];
        int i = b-1;
        for (int x = b; x < e; x++)
        {
            if(array[x].compareTo(pivot) <= 0)
            {
                i++;
                String st = array[i];
                array[i] = array[x];
                array[x] = st;

            }
        }
        String st = array[i+1];
        array[i+1] = array[e];
        array[e] = st;

        return i+1;
    }
    public static void qs(String array[], int b, int e, int noIter)
    {
        if (b < e && noIter != 0)
        {
            int index = partition(array, b, e);
            qs(array, b, index-1, --noIter);
            qs(array, index+1, e, --noIter);
        }
    }
    @Override
    public ArrayList<String> sortSimple(ArrayList<String> list, int noIter)
    {
        String[] arr = list.toArray(new String[0]);
        qs(arr,0,arr.length-1, noIter);
        list = new ArrayList<String>();
        Collections.addAll(list, arr);
        return list;

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
        qs(keys, 0, hm.keySet().size()-1, noIter);
        list = new ArrayList<ArrayList<String>>();
        for(String i : keys)
            list.addAll(hm.get(i));
        System.out.println(list);
        return list;
    }

}
