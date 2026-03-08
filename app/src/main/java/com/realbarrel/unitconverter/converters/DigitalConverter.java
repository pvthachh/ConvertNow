package com.realbarrel.unitconverter.converters;

import android.content.Context;
import android.widget.TextView;

public class DigitalConverter {

    Context context;
    String fromUnit, toUnit;
    double fromValue, toValue;
    TextView toNumberTV;

    public DigitalConverter(Context context, String fromUnit, String toUnit,
                            double fromValue, double toValue, TextView toNumberTV) {

        this.context = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.toNumberTV = toNumberTV;
    }

    public void convert() {

        double bytes = 0;

        switch (fromUnit) {
            case "Byte":
                bytes = fromValue;
                break;
            case "KB":
                bytes = fromValue * 1024;
                break;
            case "MB":
                bytes = fromValue * 1024 * 1024;
                break;
            case "GB":
                bytes = fromValue * 1024 * 1024 * 1024;
                break;
        }

        switch (toUnit) {
            case "Byte":
                toValue = bytes;
                break;
            case "KB":
                toValue = bytes / 1024;
                break;
            case "MB":
                toValue = bytes / (1024 * 1024);
                break;
            case "GB":
                toValue = bytes / (1024 * 1024 * 1024);
                break;
        }

        toNumberTV.setText(String.valueOf(toValue));
    }
}
