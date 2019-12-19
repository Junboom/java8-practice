package Animal;

class Cat extends Animal {

    public Cat(String name, int numLeg) {
        super(name, numLeg);
    }

    @Override
    protected void eat() {
        System.out.println("쩝쩝");
    }

}
