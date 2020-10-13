package com.capgemini.fruits_vegatables.model.pupple_potatoes;

import model.Potato;
import model.PotatoType;

public class AllBlue extends Potato {
    public AllBlue(double weight, PotatoType type) {
        super(weight, type);
    }

    public AllBlue(double weight) {
        super(weight);
        this.type = PotatoType.BLUE;
    }
}
