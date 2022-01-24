import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import pl.put.poznan.sortingmadness.logic.*;

import java.util.ArrayList;
public class SortTestNested {
    //Tests for sorts nested
    @Test
    public void test_nested_BogoSort() {
        BogoSort bogo = new BogoSort();

        ArrayList<ArrayList<String>> initial_list = new ArrayList<ArrayList<String>>();
        ArrayList<String> items = new ArrayList<String>();
        items.add("bbb");
        items.add("aaa");
        items.add("ccc");
        initial_list.add(items);

        ArrayList<ArrayList<String>> check_list = new ArrayList<ArrayList<String>>();
        ArrayList<String> items2 = new ArrayList<String>();
        items2.add("bbb");
        items2.add("aaa");
        items2.add("ccc");
        check_list.add(items2);

        ArrayList<ArrayList<String>> final_list = bogo.sortNested(initial_list, -1, 1); //change the parameters
        assertTrue(final_list.equals(check_list));
    }
    @Test
    public void test_nested_BubbleSort() {
        BubbleSort bubble = new BubbleSort();

        ArrayList<ArrayList<String>> initial_list = new ArrayList<ArrayList<String>>();
        ArrayList<String> items = new ArrayList<String>();
        items.add("bbb");
        items.add("aaa");
        items.add("ccc");
        initial_list.add(items);

        ArrayList<ArrayList<String>> check_list = new ArrayList<ArrayList<String>>();
        ArrayList<String> items2 = new ArrayList<String>();
        items2.add("bbb");
        items2.add("aaa");
        items2.add("ccc");
        check_list.add(items2);

        ArrayList<ArrayList<String>> final_list = bubble.sortNested(initial_list, -1, 1); //change the parameters
        assertTrue(final_list.equals(check_list));
    }
    @Test
    public void test_nested_InsertionSort() {
        InsertionSort insertion = new InsertionSort();

        ArrayList<ArrayList<String>> initial_list = new ArrayList<ArrayList<String>>();
        ArrayList<String> items = new ArrayList<String>();
        items.add("bbb");
        items.add("aaa");
        items.add("ccc");
        initial_list.add(items);

        ArrayList<ArrayList<String>> check_list = new ArrayList<ArrayList<String>>();
        ArrayList<String> items2 = new ArrayList<String>();
        items2.add("bbb");
        items2.add("aaa");
        items2.add("ccc");
        check_list.add(items2);

        ArrayList<ArrayList<String>> final_list = insertion.sortNested(initial_list, -1, 1); //change the parameters
        assertTrue(final_list.equals(check_list));
    }
    @Test
    public void test_nested_MergeSort() {
        MergeSort merge = new MergeSort();

        ArrayList<ArrayList<String>> initial_list = new ArrayList<ArrayList<String>>();
        ArrayList<String> items = new ArrayList<String>();
        items.add("bbb");
        items.add("aaa");
        items.add("ccc");
        initial_list.add(items);

        ArrayList<ArrayList<String>> check_list = new ArrayList<ArrayList<String>>();
        ArrayList<String> items2 = new ArrayList<String>();
        items2.add("bbb");
        items2.add("aaa");
        items2.add("ccc");
        check_list.add(items2);

        ArrayList<ArrayList<String>> final_list = merge.sortNested(initial_list, -1, 1); //change the parameters
        assertTrue(final_list.equals(check_list));
    }
    @Test
    public void test_nested_QuickSort() {
        QuickSort quick = new QuickSort();

        ArrayList<ArrayList<String>> initial_list = new ArrayList<ArrayList<String>>();
        ArrayList<String> items = new ArrayList<String>();
        items.add("bbb");
        items.add("aaa");
        items.add("ccc");
        initial_list.add(items);

        ArrayList<ArrayList<String>> check_list = new ArrayList<ArrayList<String>>();
        ArrayList<String> items2 = new ArrayList<String>();
        items2.add("bbb");
        items2.add("aaa");
        items2.add("ccc");
        check_list.add(items2);

        ArrayList<ArrayList<String>> final_list = quick.sortNested(initial_list, -1, 1); //change the parameters
        assertTrue(final_list.equals(check_list));
    }
    @Test
    public void test_nested_SelectionSort() {
        SelectionSort selection = new SelectionSort();

        ArrayList<ArrayList<String>> initial_list = new ArrayList<ArrayList<String>>();
        ArrayList<String> items = new ArrayList<String>();
        items.add("bbb");
        items.add("aaa");
        items.add("ccc");
        initial_list.add(items);

        ArrayList<ArrayList<String>> check_list = new ArrayList<ArrayList<String>>();
        ArrayList<String> items2 = new ArrayList<String>();
        items2.add("bbb");
        items2.add("aaa");
        items2.add("ccc");
        check_list.add(items2);

        ArrayList<ArrayList<String>> final_list = selection.sortNested(initial_list, -1, 1); //change the parameters
        assertTrue(final_list.equals(check_list));
    }
}