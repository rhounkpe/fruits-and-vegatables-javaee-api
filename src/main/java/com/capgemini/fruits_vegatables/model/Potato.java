package model;

import java.util.Set;
import java.util.TreeSet;

public abstract class Potato extends Vegetable {

    protected model.PotatoType type;
    protected Set<String> nutritionalValue;

    public Potato(double weight) {
        super(weight);
        nutritionalValue = new TreeSet<>();
    }

    public Potato(double weight, PotatoType type) {
        this(weight);
        this.type = type;
    }

    public PotatoType getType() {
        return type;
    }

    public void setType(PotatoType type) {
        this.type = type;
    }

    public Set<String> getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(Set<String> nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }

    public void addNutritionalValue(String... values) {
        for (String s : values) {
            this.nutritionalValue.add(s);
        }
    }
}
