package Animal;

class Dog extends Animal {

    public Dog(String name, int numLeg) {
        super(name, numLeg);
    }

    @Override
    protected void eat() {
        System.out.println("냠냠");
    }

}
