import pl.put.poznan.sortingmadness.logic.BogoSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.Collections;


public class TestMock {
    @Test
    void bogo_test() {
        BogoSort mockObject = mock(BogoSort.class);
        when(mockObject.sortSimple(new ArrayList<>(), -1)).thenReturn(new ArrayList<>());
        assertEquals(Collections.emptyList(), mockObject.sortSimple(new ArrayList<>(), -1));
    }
}