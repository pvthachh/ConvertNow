package com.realbarrel.unitconverter.dataProviders;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitVolumeDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {

        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits(
                "unit_volume_milliliter",
                R.string.string_units_list_volume_milliliter,
                "[ mL ]",
                "quantities_volume",
                "ic_quantities_volume.png"
        ));

        addItem(new DataItemUnits(
                "unit_volume_liter",
                R.string.string_units_list_volume_liter,
                "[ L ]",
                "quantities_volume",
                "ic_quantities_volume.png"
        ));

        addItem(new DataItemUnits(
                "unit_volume_cubic_meter",
                R.string.string_units_list_volume_cubic_meter,
                "[ m³ ]",
                "quantities_volume",
                "ic_quantities_volume.png"
        ));

        addItem(new DataItemUnits(
                "unit_volume_gallon",
                R.string.string_units_list_volume_gallon,
                "[ gal ]",
                "quantities_volume",
                "ic_quantities_volume.png"
        ));
    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}
