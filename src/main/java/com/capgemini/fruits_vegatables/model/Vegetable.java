package model;

public abstract class Vegetable extends model.VeganFood {
    protected double weight;

    public Vegetable(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
