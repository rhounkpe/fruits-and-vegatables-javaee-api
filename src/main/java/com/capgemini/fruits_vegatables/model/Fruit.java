package model;

public abstract class Fruit extends VeganFood {
    protected int weight;

    public Fruit(int weight) {
        setWeight(weight);
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int newWeight) {
        if (newWeight <= 30) {
            weight = newWeight;
        }
        // Else throw an exception
    }


}
