package com.realbarrel.unitconverter.converters;

import android.content.Context;
import android.widget.TextView;

public class VolumeConverter {

    Context context;
    String fromUnit, toUnit;
    double fromValue, toValue;
    TextView toNumberTV;

    public VolumeConverter(Context context, String fromUnit, String toUnit,
                           double fromValue, double toValue, TextView toNumberTV) {

        this.context = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.toNumberTV = toNumberTV;
    }

    public void convert() {

        double liter = 0;

        switch (fromUnit) {
            case "Milliliter":
                liter = fromValue / 1000;
                break;
            case "Liter":
                liter = fromValue;
                break;
            case "Cubic Meter":
                liter = fromValue * 1000;
                break;
        }

        switch (toUnit) {
            case "Milliliter":
                toValue = liter * 1000;
                break;
            case "Liter":
                toValue = liter;
                break;
            case "Cubic Meter":
                toValue = liter / 1000;
                break;
        }

        toNumberTV.setText(String.valueOf(toValue));
    }
}
