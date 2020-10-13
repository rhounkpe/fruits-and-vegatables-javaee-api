package com.capgemini.fruits_vegatables.model.pupple_potatoes;

import model.Potato;
import model.PotatoType;

public class Congo extends Potato {
    public Congo(double weight) {
        super(weight);
        this.type = PotatoType.BLUE;
    }
}
