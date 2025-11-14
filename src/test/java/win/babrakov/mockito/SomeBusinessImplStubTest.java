package win.babrakov.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplStubTest {

    @Test
    void testFindTheGreatestFromAllData(){
        DataService dataServiceStub = new DataServiceStub();
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = someBusinessImpl.findTheGreatestFromAllData();
        assertEquals(25,result);
    }

    @Test
    void testFindTheGreatestFromAllDataWithOneItem(){
        DataService dataServiceStub = new DataServiceStubWithOneItem();
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = someBusinessImpl.findTheGreatestFromAllData();
        assertEquals(35,result);
    }

}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5, 13};
    }
}

class DataServiceStubWithOneItem implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{35};
    }
}