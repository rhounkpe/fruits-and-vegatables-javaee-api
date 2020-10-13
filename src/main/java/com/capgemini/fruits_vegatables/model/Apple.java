package model;

public class Apple extends model.TinySeeds {
    private model.Color color;


    public Apple(int weight, model.Color color) {
        super(weight);

        this.color = color;
    }

    public model.Color getColor() {
        return color;
    }

    public void setColor(model.Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nWeight: " + weight + "\n";
    }

    //TODO: Implement a comparator of Apple here

}
