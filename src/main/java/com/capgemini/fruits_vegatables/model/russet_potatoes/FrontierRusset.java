package com.capgemini.fruits_vegatables.model.russet_potatoes;

import model.Potato;
import model.PotatoType;

public class FrontierRusset extends Potato {
    public FrontierRusset(double weight) {
        super(weight);
        this.type = PotatoType.RUSSET;
    }
}
