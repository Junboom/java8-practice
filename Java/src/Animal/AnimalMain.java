package Animal;

public class AnimalMain {

    public static void main(String[] args) {
        Animal cat = new Cat("몽", 3);
        System.out.println(cat.getName());
        System.out.println(cat.getNumLeg());
        cat.eat();
    }

}
