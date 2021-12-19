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

    @RequestMapping(method = RequestMethod.POST, produces = "application/json", path = "simple")
    public ArrayList<String> post(@RequestBody RequestSimple request) {

        // log the parameters
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

        // perform the transformation, you should run your logic here, below is just a silly example
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

    @RequestMapping(method = RequestMethod.POST, produces = "application/json", path = "nested")
    ArrayList<ArrayList<String>> post(@RequestBody RequestNested request) {
        return request.nestedList;
        //TODO
    }

}


