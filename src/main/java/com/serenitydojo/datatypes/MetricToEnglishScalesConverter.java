package com.serenitydojo.datatypes;

public class MetricToEnglishScalesConverter {

    public double celciusToFarenheit(double celcius) {
        return (float) 9 / (float) 5 * celcius + 32;
    }

    public double kilosToPounds(int weightInKilograms) {
        return  weightInKilograms * 2.20462;
    }
}
