package Homework1.Task1;

public class Zoo<F extends Flyable, B extends Bitable, S extends Swimable> {

    private F flyable;
    private B bitable;
    private S swimable;

    public Zoo() {
    }
    public Zoo(F flyable, B bitable, S swimable) {
        this.flyable = flyable;
        this.bitable = bitable;
        this.swimable = swimable;
    }

    public void feedFlyable(){
        System.out.println("Летающее животное ест");
        flyable.fly();
    }
    public void feedSwimable(){
        System.out.println("Плавающее животное ест");
        swimable.swim();
    }
    public void feedBitable(){
        System.out.println("Кусающее животное ест");
        bitable.bite();
    }

    public void setFlyable(F flyable) {
        this.flyable = flyable;
    }

    public void setBitable(B bitable) {
        this.bitable = bitable;
    }

    public void setSwimable(S swimable) {
        this.swimable = swimable;
    }

    public F getFlyable() {
        return flyable;
    }

    public B getBitable() {
        return bitable;
    }

    public S getSwimable() {
        return swimable;
    }

    // Неверная реализация
    //    Сделал сам
    //    НЕВЕРНО!
    //    private A animalFlyable;
    //    private B animalSwimable;
    //    private C animalBitable;
    //
    //    public Zoo(A animalFlyable, B animalSwimable, C animalBitable) {
    //        this.animalFlyable = animalFlyable;
    //        this.animalSwimable = animalSwimable;
    //        this.animalBitable = animalBitable;
    //    }
    //
    //    public A getFlyable() {
    //        return animalFlyable;
    //    }
    //
    //    public void setFlyable(A animalFlyable) {
    //        this.animalFlyable = animalFlyable;
    //    }
    //
    //    public B getSwimable() {
    //        return animalSwimable;
    //    }
    //
    //    public void setSwimable(B animalSwimable) {
    //        this.animalSwimable = animalSwimable;
    //    }
    //
    //    public C getBitable() {
    //        return animalBitable;
    //    }
    //
    //    public void setBitable(C animalBitable) {
    //        this.animalBitable = animalBitable;
    //    }

}
