package com.realbarrel.unitconverter.dataProviders;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitTimeDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {

        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits(
                "unit_time_second",
                R.string.string_units_list_time_second,
                "[ s ]",
                "quantities_time",
                "ic_quantities_time.png"
        ));

        addItem(new DataItemUnits(
                "unit_time_minute",
                R.string.string_units_list_time_minute,
                "[ min ]",
                "quantities_time",
                "ic_quantities_time.png"
        ));

        addItem(new DataItemUnits(
                "unit_time_hour",
                R.string.string_units_list_time_hour,
                "[ h ]",
                "quantities_time",
                "ic_quantities_time.png"
        ));

        addItem(new DataItemUnits(
                "unit_time_day",
                R.string.string_units_list_time_day,
                "[ d ]",
                "quantities_time",
                "ic_quantities_time.png"
        ));

        addItem(new DataItemUnits(
                "unit_time_week",
                R.string.string_units_list_time_week,
                "[ wk ]",
                "quantities_time",
                "ic_quantities_time.png"
        ));
    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}
