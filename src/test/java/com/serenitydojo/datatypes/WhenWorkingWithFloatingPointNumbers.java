package com.serenitydojo.datatypes;

import org.junit.Test;

import java.text.DecimalFormat;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {


    //
    // Exercise 1: Convert 27 degrees Celcius to Farenheit
    // The equation is: farenheit = (9 / 5) * celcius + 32
    //
    @Test
    public void convertToFarenheit() {
        double celcius = 27.0d;
        double farenheit = 0.0d;

        // TODO: Use a floating point calculation to calculate the farenheit equivalent of the celcius value.
        DecimalFormat df = new DecimalFormat("#.#");
        MetricToEnglishScalesConverter temperature=new MetricToEnglishScalesConverter();
        farenheit = temperature.celciusToFarenheit(celcius);
        assertThat(Float.valueOf(df.format(farenheit)), equalTo(80.6F));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertMetersToFeet() {
        int weightInKilograms = 50;
        double weightInPounds = 0;

        // TODO: Use a floating point calculation to calculate the correct weight in pounds
        DecimalFormat df = new DecimalFormat("#.###");
        MetricToEnglishScalesConverter weight=new MetricToEnglishScalesConverter();
        weightInPounds=weight.kilosToPounds(weightInKilograms);
        assertThat(Float.valueOf(df.format(weightInPounds)), equalTo(110.231F));

    }
}
