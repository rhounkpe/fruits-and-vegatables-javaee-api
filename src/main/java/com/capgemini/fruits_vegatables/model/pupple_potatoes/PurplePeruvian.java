package com.capgemini.fruits_vegatables.model.pupple_potatoes;

import model.Potato;
import model.PotatoType;

public class PurplePeruvian extends Potato {
    public PurplePeruvian(double weight, PotatoType type) {
        super(weight, type);
    }

    public PurplePeruvian(double weight) {
        super(weight);
        this.type = PotatoType.BLUE;
    }
}
