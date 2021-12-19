package pl.put.poznan.sortingmadness.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


/**
* BogoSort is an implementation of the SortingStrategy interface 
* that provides the BogoSort algorithm
*
* @author czarnobylu [Jan Bylicki jbylicki@hotmail.com]
*/
public class BogoSort implements SortingStrategy {
    /**
    * <p> This method shuffles the array using the
    * <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#The_modern_algorithm">Fisher-Yates</a>
    * algorithm
    * </p>
    * @param arr the array to be shuffled
    */
    private static void shuffleArray(String[] arr)
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = arr.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            String a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }
    private static boolean isSorted(String arr[])
    {
        for(int i=1; i<arr.length; i++)
            if(arr[i-1].compareTo(arr[i]) > 0)
                return false;
        return true;
    }
    private static void bs(String arr[], int noIter)
    {
        while(!isSorted(arr) && (noIter > 0 || noIter == -1))
        {
            shuffleArray(arr);
            if(noIter != -1) noIter--;
        }
    }
    @Override
    public ArrayList<String> sortSimple(ArrayList<String> list, int noIter)
    {
        String[] arr = list.toArray(new String[0]);
        bs(arr, noIter);
        list = new ArrayList<String>();
        Collections.addAll(list, arr);
        return list;
    }
    @Override
    public ArrayList<ArrayList<String>> sortNested(ArrayList<ArrayList<String>> list, int noIter, String column)
    {
        return new ArrayList<ArrayList<String>>();
    }
}
