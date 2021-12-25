package pl.put.poznan.sortingmadness.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.sortingmadness.logic.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/sort")
public class MadnessController {

    private static final Logger logger = LoggerFactory.getLogger(MadnessController.class);
    private static final ReverseData reverser = new ReverseData();
    private SortingStrategy sort;
    private Timer timer = new Timer();

    void chooseStrategy(String algorithm) {
        switch (algorithm) {
            case "BogoSort":
                sort = new BogoSort();
                break;
            case "BubbleSort":
                sort = new BubbleSort();
                break;
            case "InsertionSort":
                sort = new InsertionSort();
                break;
            case "QuickSort":
                sort = new QuickSort();
                break;
            case "SelectionSort":
                sort = new SelectionSort();
                break;
            default:
                sort = new MergeSort();
        }
    }

    /*
    //sample query
    POST http://localhost:8080/sort/simple
    Content-Type: application/json

    {
      "simpleList": ["3794", "3793", "3792", "3791", "3790", "3789", "3788", "3787", "3786", "3785", "3784", "3783", "3782"],
      "noIter": -1,
      "algorithm": "QuickSort",
      "isReversed": false
    }
     */
    @RequestMapping(method = RequestMethod.POST, produces = "application/json", path = "simple")
    public ArrayList<String> post(@RequestBody RequestSimple request) {

        // log the parameters and check for bad declarations
        if(request.simpleList == null) {
            logger.debug("List not defined!");
            return new ArrayList<String>();
        }

        if(request.algorithm == null) {
            logger.debug("The algorithm has not been chosen, assuming optimal strategy - mergesort");
            request.algorithm = "mergesort";
        }

        if(request.noIter == 0) {
            logger.debug("Number of iterations has not been chosen, assuming unlimited");
            request.noIter = -1;
        }

        logger.debug(request.simpleList.toString());
        System.out.println();

        chooseStrategy(request.algorithm);

        // perform the transformation
        timer.startTimer();
        ArrayList<String> output = new ArrayList<>();
        if (request.isReversed == true)
            output = reverser.reverseSimple(sort.sortSimple(request.simpleList, request.noIter));
        else
            output = sort.sortSimple(request.simpleList, request.noIter);
        timer.stopTimer();

        logger.debug("Time: " + timer.getTime() + "ms");

        return output;
    }


    /*
    //sample query
    POST http://localhost:8080/sort/nested
    Content-Type: application/json

    {
      "nestedList": [["7","5","3"], ["1","8","2"]],
      "column": 1,
      "noIter": -1,
      "algorithm": "QuickSort",
      "isReversed": false
    }
     */
    @RequestMapping(method = RequestMethod.POST, produces = "application/json", path = "nested")
    ArrayList<ArrayList<String>> post(@RequestBody RequestNested request) {

        // log the parameters and check for bad declarations
        if(request.nestedList == null) {
            logger.debug("List not defined!");
            return new ArrayList<ArrayList<String>>();
        }

        if(request.algorithm == null) {
            logger.debug("The algorithm has not been chosen, assuming optimal strategy - mergesort");
            request.algorithm = "mergesort";
        }

        if(request.noIter == 0) {
            logger.debug("Number of iterations has not been chosen, assuming unlimited");
            request.noIter = -1;
        }

        if(request.column > request.nestedList.size() || 0 > request.column) {
            logger.debug("Wrong chosen column, assuming 0");
            request.column = 0;
        }

        logger.debug(request.nestedList.toString());

        chooseStrategy(request.algorithm);

        // perform the transformation
        timer.startTimer();
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        if (request.isReversed == true)
            //sort.sortNested(request.nestedList, request.noIter, request.column)
            output = reverser.reverseNested(request.nestedList);
        else
            output = sort.sortNested(request.nestedList, request.noIter, request.column);
        timer.stopTimer();

        logger.debug("Time: " + timer.getTime() + "ms");

        return output;
    }

}


