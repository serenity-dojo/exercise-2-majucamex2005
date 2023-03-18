package com.serenitydojo.datatypes;

public class StringsFormatter {

    public String convertString(String Operation, String OriginalString) {

        switch (Operation) {
            case "lowerCaseTitle":
                return OriginalString.toLowerCase();
            case "upperCaseTitle":
                return OriginalString.toUpperCase();
            case "trimmedTitle":
                return OriginalString.trim();
            case "updatedTitle":
                return OriginalString.replace("Cat", "Dog");
            case "length":
                return String.valueOf(OriginalString.length());
            default:
                return "invalid tring operation";
        }

    }

}
