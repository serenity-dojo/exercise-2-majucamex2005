package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStrings {

    StringsFormatter stringOperator = new StringsFormatter();
    @Test
    public void convertToLowerCase() {
        String bookTitle = "The Cat In The Hat";

        String lowerCaseTitle = "";
        // TODO: Convert the book title to lower case and assign it to the lowerCaseTitle variable
        lowerCaseTitle=stringOperator.convertString("lowerCaseTitle", bookTitle);
        assertThat(lowerCaseTitle, equalTo("the cat in the hat"));

    }

    @Test
    public void convertToUpperCase() {
        String bookTitle = "The Cat In The Hat";

        String upperCaseTitle = "";
        // TODO: Convert the book title to upper case and assign it to the lowerCaseTitle variable
        upperCaseTitle=stringOperator.convertString("upperCaseTitle", bookTitle);
        assertThat(upperCaseTitle, equalTo("THE CAT IN THE HAT"));
    }

    @Test
    public void trimExtraSpaces() {
        String bookTitle = "  The Cat In The Hat    ";

        String trimmedTitle = "";
        // TODO: Trim the spaces before and after the title text
        trimmedTitle=stringOperator.convertString("trimmedTitle", bookTitle);
        assertThat(trimmedTitle, equalTo("The Cat In The Hat"));
    }

    @Test
    public void findTheLengthOfAString() {
        String bookTitle = "The Cat In The Hat";

        int length = 0;
        // TODO: Find the number of characters in the string
        length= Integer.parseInt(stringOperator.convertString("length", bookTitle));
        assertThat(length, equalTo(18));
    }

    @Test
    public void replacingAText() {
        String bookTitle = "The Cat In The Hat";

        String updatedTitle = "";
        // TODO: Replace the word "Cat" with "Dog
        updatedTitle=stringOperator.convertString("updatedTitle", bookTitle);
        assertThat(updatedTitle, equalTo("The Dog In The Hat"));
    }
}
