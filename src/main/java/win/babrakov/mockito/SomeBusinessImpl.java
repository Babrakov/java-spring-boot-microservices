package win.babrakov.mockito;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData() {
        int greatestValue = Integer.MIN_VALUE;
        int[] data = dataService.retrieveAllData();
        for (int value : data) {
            if (value > greatestValue) {
                greatestValue = value;
            }
        }
        return greatestValue;
    }

}

interface DataService {

    int[] retrieveAllData();
}
