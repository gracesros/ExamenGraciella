package com.grace.examengraciella;


import java.util.ArrayList;

public class ListDataHelper {
    public static ArrayList<ListViewItem> provideItems(){
        ArrayList<ListViewItem> list = new ArrayList<>();
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, " Holo azul brillante ", android.R.color.holo_blue_bright));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, " Holo azul claro ", android.R.color.holo_blue_light));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, " Holo verde claro", android.R.color.holo_green_light));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, " Holo naranja claro", android.R.color.holo_orange_light));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, " Holo rojo claro", android.R.color.holo_red_light));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, " Holo morado", android.R.color.holo_purple));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, " Holo azul marino", android.R.color.holo_blue_dark));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, " Holo verde", android.R.color.holo_green_dark));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, " Holo rojo oscuro", android.R.color.holo_red_dark));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, " Holo narajan oscuro", android.R.color.holo_orange_dark));

        return list;
    }
}