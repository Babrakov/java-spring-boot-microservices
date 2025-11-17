package win.babrakov.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

    @Mock
    private DataService dataService;

    @InjectMocks
    private SomeBusinessImpl someBusinessImpl;


    @Test
    void testFindTheGreatestFromAllData() {
        when(dataService.retrieveAllData()).thenReturn(new int[]{25, 11, 5, 18});
        int result = someBusinessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }

    @Test
    void testFindTheGreatestFromAllDataWithOneItem() {
        when(dataService.retrieveAllData()).thenReturn(new int[]{35});
        int result = someBusinessImpl.findTheGreatestFromAllData();
        assertEquals(35, result);
    }

    @Test
    void testFindTheGreatestFromAllDataWithEmptyArray() {
        when(dataService.retrieveAllData()).thenReturn(new int[]{});
        int result = someBusinessImpl.findTheGreatestFromAllData();
        assertEquals(Integer.MIN_VALUE, result);
    }


}