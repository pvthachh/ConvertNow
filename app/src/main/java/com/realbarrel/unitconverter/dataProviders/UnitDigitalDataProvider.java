package com.realbarrel.unitconverter.dataProviders;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitDigitalDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {

        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits(
                "unit_digital_byte",
                R.string.string_units_list_digital_byte,
                "[ B ]",
                "quantities_digital",
                "ic_quantities_digital.png"
        ));

        addItem(new DataItemUnits(
                "unit_digital_kilobyte",
                R.string.string_units_list_digital_kilobyte,
                "[ KB ]",
                "quantities_digital",
                "ic_quantities_digital.png"
        ));

        addItem(new DataItemUnits(
                "unit_digital_megabyte",
                R.string.string_units_list_digital_megabyte,
                "[ MB ]",
                "quantities_digital",
                "ic_quantities_digital.png"
        ));

        addItem(new DataItemUnits(
                "unit_digital_gigabyte",
                R.string.string_units_list_digital_gigabyte,
                "[ GB ]",
                "quantities_digital",
                "ic_quantities_digital.png"
        ));
    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}
