package Homework1_1;

public class Zoo<A extends Animal, B extends Animal, C extends Animal> {

    private A animalFlyable;
    private B animalSwimable;
    private C animalBitable;

    public Zoo(A animalFlyable, B animalSwimable, C animalBitable) {
        this.animalFlyable = animalFlyable;
        this.animalSwimable = animalSwimable;
        this.animalBitable = animalBitable;
    }

    public A getFlyable() {
        return animalFlyable;
    }

    public void setFlyable(A animalFlyable) {
        this.animalFlyable = animalFlyable;
    }

    public B getSwimable() {
        return animalSwimable;
    }

    public void setSwimable(B animalSwimable) {
        this.animalSwimable = animalSwimable;
    }

    public C getBitable() {
        return animalBitable;
    }

    public void setBitable(C animalBitable) {
        this.animalBitable = animalBitable;
    }

}
