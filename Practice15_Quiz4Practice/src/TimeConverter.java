//Parent class

public class TimeConverter {
    //[Notes here]
    protected double inputValue;
    protected String fromUnit;
    protected String toUnit;
    protected double convertedValue;

    //Constructor here
    public TimeConverter(double inputValue, String fromUnit, String toUnit) {
        this.inputValue = inputValue;
        this.fromUnit = fromUnit.toUpperCase();
        this.toUnit = toUnit.toLowerCase();
        this.convertedValue = 0.00;
    } //End Bracket of Constructor classes

    //==============================
    //Methods found here
    public double convert() {
        return 0.0;
    }

    //Shared display method inherited by all child classes
    public void displayConversion() {
        System.out.printf("%.2f %s = %.6f %s\n", inputValue, fromUnit, convertedValue, toUnit);
        //Note dont use println, use printf, or else you get a red squigly line
    }

    //Getters for reverse func
    public double getConvertedValue() {
        return convertedValue;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public String getToUnit() {
        return toUnit;
    }

    //==============================

} //End bracket for whole class
