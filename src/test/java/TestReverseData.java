import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import pl.put.poznan.sortingmadness.logic.*;

import java.util.ArrayList;
public class TestReverseData {
    @Test
    public void test_reverse() {
        ReverseData reverse = new ReverseData();

        ArrayList<String> initial_list = new ArrayList<String>();
        initial_list.add("b");
        initial_list.add("a");
        initial_list.add("c");

        ArrayList<String> check_list = new ArrayList<String>();
        check_list.add("c");
        check_list.add("a");
        check_list.add("b");

        ArrayList<String> final_list = reverse.reverseSimple(initial_list);
        assertTrue(final_list.equals(check_list));
    }
}