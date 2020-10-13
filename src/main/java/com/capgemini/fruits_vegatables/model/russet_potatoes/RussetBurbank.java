package com.capgemini.fruits_vegatables.model.russet_potatoes;


public class RussetBurbank extends model.Potato {
    public RussetBurbank(double weight) {
        super(weight);
        this.type = model.PotatoType.RUSSET;
    }
}
