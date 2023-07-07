package domain;

public class Details {

    //Performing ENCAPSULATOIN by Making the Datatypes private and implementing Getters and Setters method.
    private String name;
    private int legs;
    private String Category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Details() {
    }

    public Details(String name, int legs, String category) {
        this.name = name;
        this.legs = legs;
        Category = category;
    }

    @Override
    public String toString() {
        return "Details{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                ", Category='" + Category + '\'' +
                '}';
    }
}
