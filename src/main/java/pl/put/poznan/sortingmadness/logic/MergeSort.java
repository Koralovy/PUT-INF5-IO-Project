package pl.put.poznan.sortingmadness.logic;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSort implements SortingStrategy {
    @Override
    public ArrayList<String> sortSimple(ArrayList<String> list, int noIter) {
        String[] arr = list.toArray(new String[0]);
        mergeSort(arr, 0, arr.length - 1, noIter, 0);
        list = new ArrayList<String>();
        Collections.addAll(list, arr);
        return list;
    }

    private static void mergeSort(String[] a, int from, int to, int breakpoint, int noIter) {
        if (from == to || breakpoint == noIter) {
            return;
        }
        int mid = (from + to) / 2;
        noIter += 1;
        mergeSort(a, from, mid, breakpoint, noIter);
        mergeSort(a,mid + 1, to, breakpoint, noIter);
        merge(a, from, mid, to);
    }

    private static void merge(String[] a, int from, int mid, int to) {
        int n = to - from + 1;
        String[] b = new String[n];
        int i1 = from;
        int i2 = mid + 1;
        int j = 0;

        while (i1 <= mid && i2 <= to) {
            if (a[i1].compareTo(a[i2]) < 0) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        while (i1 <= mid) {
            b[j] = a[i1];
            i1++;
            j++;
        }

        while (i2 <= to) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[from + j] = b[j];
        }
    }
    @Override
    public ArrayList<ArrayList<String>> sortNested(ArrayList<ArrayList<String>> list, int noIter, String column)
    {
        return new ArrayList<ArrayList<String>>();
    }
}