package Bird;

public class Bird {

    String name;
    int legCount;

    public Bird(String name, int legCount) {
        this.name = name;
        this.legCount = legCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    void fly() {
        System.out.println("새가 난다");
    }

}
