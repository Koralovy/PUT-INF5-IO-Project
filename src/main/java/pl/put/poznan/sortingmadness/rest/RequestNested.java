package pl.put.poznan.sortingmadness.rest;

import java.util.ArrayList;

public class RequestNested {
    public String algorithm;
    public final ArrayList<ArrayList<String>> nestedList;
    public int noIter;
    public int column;
    public final boolean isReversed;

    public RequestNested(String algorithm, ArrayList<ArrayList<String>> nestedList, int noIter, int column, boolean isReversed){
        this.algorithm = algorithm;
        this.nestedList = nestedList;
        this.noIter = noIter;
        this.column = column;
        this.isReversed = isReversed;
    }

}