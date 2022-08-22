package Homework1_1;

public class Zoo<A, T> {
    private A animal;
    private T action;

    public Zoo(A animal, T action) {
        this.animal = animal;
        this.action = action;
    }

    public A getAnimal() {
        return animal;
    }

    public void setAnimal(A animal) {
        this.animal = animal;
    }

    public T getAction() {
        return action;
    }

    public void setAction(T action) {
        this.action = action;
    }
}
