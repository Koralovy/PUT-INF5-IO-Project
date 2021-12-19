package pl.put.poznan.sortingmadness.rest;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class RequestSimple {
    public String algorithm;
    public final ArrayList<String> simpleList;
    public int noIter;
    public final boolean isReversed;

    public RequestSimple(String algorithm, ArrayList<String> simpleList, int noIter, boolean isReversed){
        this.algorithm = algorithm;
        this.simpleList = simpleList;
        this.noIter = noIter;
        this.isReversed = isReversed;
    }
}
/*
{
    "jsonString": ["a", "b", "c"],
    "noIter": 5
}
 */