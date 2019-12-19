package Animal;

abstract class Animal {

    private String name;
    private int numLeg;

    public Animal(String name, int numLeg) {
        this.name = name;
        this.numLeg = numLeg;
    }

    public Animal() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumLeg() {
        return numLeg;
    }

    public void setNumLeg(int numLeg) {
        this.numLeg = numLeg;
    }

    protected void eat() {

    }

}
