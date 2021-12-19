package pl.put.poznan.sortingmadness.rest;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class RequestNested {
    public String algorithm;
    public final ArrayList<ArrayList<String>> nestedList;
    public final int noIter;
    public final String column;
    public final boolean isReversed;

    public RequestNested(String algorithm, ArrayList<ArrayList<String>> nestedList, int noIter, String column, boolean isReversed){
        this.algorithm = algorithm;
        this.nestedList = nestedList;
        this.noIter = noIter;
        this.column = column;
        this.isReversed = isReversed;
    }

}

/*
{
    "jsonString": ["a": ["b", "c", "d"], "b": ["b", "c", "d"]],
    "noIter": 5
}
*/
