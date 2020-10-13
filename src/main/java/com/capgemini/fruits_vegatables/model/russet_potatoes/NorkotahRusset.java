package com.capgemini.fruits_vegatables.model.russet_potatoes;

import model.Potato;
import model.PotatoType;

public class NorkotahRusset extends Potato {
    public NorkotahRusset(double weight) {
        super(weight);
        this.type = PotatoType.RUSSET;
    }
}
