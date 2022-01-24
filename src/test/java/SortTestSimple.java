import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import pl.put.poznan.sortingmadness.logic.*;

import java.util.ArrayList;

public class SortTestSimple {

    //tests for sort simple
    @Test
    public void test_BogoSort() {
        BogoSort bogo = new BogoSort();

        ArrayList<String> initial_list = new ArrayList<String>();
        initial_list.add("b");
        initial_list.add("a");
        initial_list.add("c");

        ArrayList<String> check_list = new ArrayList<String>();
        check_list.add("a");
        check_list.add("b");
        check_list.add("c");

        ArrayList<String> final_list = bogo.sortSimple(initial_list, -1);
        assertTrue(final_list.equals(check_list));
    }
    @Test
    public void test_BubbleSort() {
        BubbleSort bubble = new BubbleSort();

        ArrayList<String> initial_list = new ArrayList<String>();
        initial_list.add("b");
        initial_list.add("a");
        initial_list.add("c");

        ArrayList<String> check_list = new ArrayList<String>();
        check_list.add("a");
        check_list.add("b");
        check_list.add("c");

        ArrayList<String> final_list = bubble.sortSimple(initial_list, -1);
        assertTrue(final_list.equals(check_list));
    }
    @Test
    public void test_InsertionSort() {
        InsertionSort insertion = new InsertionSort();

        ArrayList<String> initial_list = new ArrayList<String>();
        initial_list.add("b");
        initial_list.add("a");
        initial_list.add("c");

        ArrayList<String> check_list = new ArrayList<String>();
        check_list.add("a");
        check_list.add("b");
        check_list.add("c");

        ArrayList<String> final_list = insertion.sortSimple(initial_list, -1);
        assertTrue(final_list.equals(check_list));
    }
    @Test
    public void test_MergeSort() {
        MergeSort merge = new MergeSort();

        ArrayList<String> initial_list = new ArrayList<String>();
        initial_list.add("b");
        initial_list.add("a");
        initial_list.add("c");

        ArrayList<String> check_list = new ArrayList<String>();
        check_list.add("a");
        check_list.add("b");
        check_list.add("c");

        ArrayList<String> final_list = merge.sortSimple(initial_list, -1);
        assertTrue(final_list.equals(check_list));
    }
    @Test
    public void test_QuickSort() {
        QuickSort quick = new QuickSort();

        ArrayList<String> initial_list = new ArrayList<String>();
        initial_list.add("b");
        initial_list.add("a");
        initial_list.add("c");

        ArrayList<String> check_list = new ArrayList<String>();
        check_list.add("a");
        check_list.add("b");
        check_list.add("c");

        ArrayList<String> final_list = quick.sortSimple(initial_list, -1);
        assertTrue(final_list.equals(check_list));
    }
    @Test
    public void test_SelectionSort() {
        SelectionSort selection = new SelectionSort();

        ArrayList<String> initial_list = new ArrayList<String>();
        initial_list.add("b");
        initial_list.add("a");
        initial_list.add("c");

        ArrayList<String> check_list = new ArrayList<String>();
        check_list.add("a");
        check_list.add("b");
        check_list.add("c");

        ArrayList<String> final_list = selection.sortSimple(initial_list, -1);
        assertTrue(final_list.equals(check_list));
    }
}