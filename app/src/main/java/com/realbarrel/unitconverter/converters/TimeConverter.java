package com.realbarrel.unitconverter.converters;

import android.content.Context;
import android.widget.TextView;

public class TimeConverter {

    Context context;
    String fromUnit, toUnit;
    double fromValue, toValue;
    TextView toNumberTV;

    public TimeConverter(Context context, String fromUnit, String toUnit,
                         double fromValue, double toValue, TextView toNumberTV) {

        this.context = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.toNumberTV = toNumberTV;
    }

    public void convert() {

        double seconds = 0;

        switch (fromUnit) {
            case "Second":
                seconds = fromValue;
                break;
            case "Minute":
                seconds = fromValue * 60;
                break;
            case "Hour":
                seconds = fromValue * 3600;
                break;
            case "Day":
                seconds = fromValue * 86400;
                break;
        }

        switch (toUnit) {
            case "Second":
                toValue = seconds;
                break;
            case "Minute":
                toValue = seconds / 60;
                break;
            case "Hour":
                toValue = seconds / 3600;
                break;
            case "Day":
                toValue = seconds / 86400;
                break;
        }

        toNumberTV.setText(String.valueOf(toValue));
    }
}
