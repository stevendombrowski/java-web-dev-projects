package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
        return Integer.compare(flavor1.getAllergens().size(), flavor2.getAllergens().size());
    }
}
