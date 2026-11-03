public class TemperatureRecord {
    double originalValue;
    String originalUnit;
    double convertedValue;
    String targetUnit;

    public TemperatureRecord(double originalValue, String originalUnit, double convertedValue, String targetUnit) {
        this.originalValue = originalValue;
        this.originalUnit = originalUnit;
        this.convertedValue =  convertedValue;
        this.targetUnit = targetUnit;
    }

    public void displayRecord(int index) {
        System.out.printf("[%d] %.2f°%s --> %.2f°%s\n",
                index, originalValue, originalUnit, convertedValue, targetUnit);
    }

}
