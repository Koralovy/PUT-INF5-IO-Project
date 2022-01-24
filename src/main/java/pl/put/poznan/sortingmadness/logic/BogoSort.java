package pl.put.poznan.sortingmadness.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
    /**
    * <p> This method checks if the supplied array is sorted
    * </p>
    * @param arr the array to be tested
    * @return True value if the array is sorted, else False.
    */
    private static boolean isSorted(String arr[])
    {
        for(int i=1; i<arr.length; i++)
            if(arr[i-1].compareTo(arr[i]) > 0)
                return false;
        return true;
    }
    /**
    * <p> This method implements the 
    * <a href="https://pl.wikipedia.org/wiki/Bogosort">Bogo Sort</a> algorithm
    * </p>
    * @param arr the array to be sorted
    * @param noIter the number of iterations of the algorithm to perform (-1 to perform all the necessary ones)
    */
    private static void bs(String arr[], int noIter)
    {
        while(!isSorted(arr) && (noIter > 0 || noIter == -1))
        {
            shuffleArray(arr);
            if(noIter != -1) noIter--;
        }
    }
    /**
    * This is an interface-level call using ArrayLists to invoke the algorithm
    * @param list the ArrayList&lt;String&gt; to be sorted
    * @param noIter the number of iterations of the algorithm to perform (-1 to perform all the necessary ones)
    * @return The sorted ArrayList&lt;String&gt;
    */
    @Override
    public ArrayList<String> sortSimple(ArrayList<String> list, int noIter)
    {
        String[] arr = list.toArray(new String[0]);
        bs(arr, noIter);
        list = new ArrayList<String>();
        Collections.addAll(list, arr);
        return list;
    }
    /**
    * This is an interface-level call using nested ArrayLists to invoke the algorithm
    * @param list the ArrayList&lt;ArrayList&lt;String&gt;&gt; to be sorted
    * @param noIter the number of iterations of the algorithm to perform (-1 to perform all the necessary ones)
    * @param column the column by which the Array should be sorted
    * @return The sorted ArrayList&lt;ArrayList&lt;String&gt;&gt; 
    */
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
        bs(keys, noIter);
        list = new ArrayList<ArrayList<String>>();
        for(String i : keys)
            list.addAll(hm.get(i));
        System.out.println(list);
        return list;
    }
}
