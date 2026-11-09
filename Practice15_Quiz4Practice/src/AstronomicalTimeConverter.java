//Child Class 2

public class AstronomicalTimeConverter extends TimeConverter{
    //Calls the parent constructor here
    public AstronomicalTimeConverter(double inputValue, String fromUnit, String toUnit) {
        super(inputValue, fromUnit, toUnit);
    }

    @Override
    public double convert() {
        if (fromUnit.equalsIgnoreCase(toUnit)) {
            convertedValue = inputValue;
            return convertedValue;
        } //End bracket of if else in public double class

        //Switch case block 1 here
        double days;
        switch (fromUnit.toLowerCase().trim()) {
            //Do note this is actually plausible
            case "d":
                days = inputValue;
                break;

            //Standard non-leap year case
            case "y": // FIX: Changed from "m" to "y"
                days = inputValue*365.00;
                break;

            //Leap year case
            case "ly":
                days = inputValue*366.00;
                break;

            default:
                days = inputValue;

        } //End of Switch case block 1

        //Switch case block 2 starts here
        switch (toUnit.toLowerCase().trim()) { // FIX: Changed from 'fromUnit' to 'toUnit'
            //Do note this is actually plausible
            case "d":
                convertedValue = days;
                break;

            //Standard non-leap year case
            case "y": // FIX: Changed from "m" to "y", and assigned to convertedValue
                convertedValue = days/365.00;
                break;

            //Leap year case
            case "ly": // FIX: Assigned to convertedValue
                convertedValue = days/366.00;
                break;

            default:
                convertedValue = days;

        } //End of Switch case block 2

        return convertedValue;

    } //End Bracket of convert class

} //End Bracket for child class