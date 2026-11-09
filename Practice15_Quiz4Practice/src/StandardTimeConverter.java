//Child Class 1

public class StandardTimeConverter extends TimeConverter{
    //Calls the parent constructor here
    public StandardTimeConverter(double inputValue, String fromUnit, String toUnit) {
        super(inputValue, fromUnit, toUnit);
    }

    @Override
    public double convert() {
        if (fromUnit.equalsIgnoreCase(toUnit)) {
            convertedValue = inputValue;
            return convertedValue;
        } //End bracket of if else in public double class

        //Switch case block 1 here
        double seconds;
        switch (fromUnit.toLowerCase().trim()) {
            //Do note this is actually plausible
            case "s":
            case "sec":
                seconds = inputValue;
                break;

            case "m":
            case "min":
                seconds = inputValue*60;
                break;

            case "h":
            case "hr":
                seconds = inputValue*3600.00;
                break;

            case "d":
            case "day":
                seconds = inputValue*86400.00;
                break;

            default:
                seconds = inputValue;

        } //End of Switch case block 1

        //Switch case block 2 starts here
        switch (toUnit.toLowerCase().trim()) {
            case "s":
            case "sec":
                convertedValue = seconds; //redundant but why not
                break;

            case "m":
            case "min":
                convertedValue = seconds/60; // FIX: Assign to convertedValue
                break;

            case "h":
            case "hr":
                convertedValue = seconds/3600.00; // FIX: Assign to convertedValue
                break;

            case "d":
            case "day":
                convertedValue = seconds/86400.00; // FIX: Assign to convertedValue
                break;

            default:
                convertedValue = seconds;

        } //end bracket of Switch case block 2

        return convertedValue;

    } //End Bracket of convert class

} //End Bracket for child class