package win.babrakov.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessImplMockTest {

    @Test
    void testFindTheGreatestFromAllData() {
        DataService dataService = mock(DataService.class);
        when(dataService.retrieveAllData()).thenReturn(new int[]{25, 11, 5, 18});
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataService);
        int result = someBusinessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }

    @Test
    void testFindTheGreatestFromAllDataWithOneItem() {
        DataService dataService = mock(DataService.class);
        when(dataService.retrieveAllData()).thenReturn(new int[]{35});
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataService);
        int result = someBusinessImpl.findTheGreatestFromAllData();
        assertEquals(35, result);
    }

}