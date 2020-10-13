package model;

/**
 * There are more than 200 varieties of potatoes sold throughout the United States.
 * Each of these varieties fit into one of seven potato type categories:
 * - russet,
 * - red,
 * - white,
 * - yellow,
 * - blue/purple,
 * - fingerling and
 * - petite.
 */
public enum PotatoType {
    RUSSET("russet"),
    RED("red"),
    WHITE("white"),
    YELLOW("yellow"),
    BLUE("blue/purple"),
    FINGERLING("fingerling"),
    PETITE("petite");

    private String name;

    PotatoType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
