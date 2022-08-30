package Homework1_1.Task1;

public class Runner {
    //Задача №1
    //Создать интерфейсы flyable (метод void fly()), swimable (метод void swim), bitable (метод void bite)
    //Создать класс Zoo, который может содержать в себе 3-х вида животных
    //1. Животное плавающее
    //2. Животное летающее
    //3. Животное кусающее
    //В классе Zoo будут методы получения и замены этих животных. Получить мы должны конкретные классы,
    //а не интерфейсы.
    //Зоопарк имеет методы - void feedFlyable(),void feedSwimable(),void feedBitable(). Логика внутри метода:
    //Печать на экран "летающее животное ест", вызов у животного метода fly() и тд.
    //Создать 6 классов животных - 2 класса плавающих, 2 класса летающих, 2 класса кусающих.
    //Создать по одному экземпляру на каждый класс.
    //Создать 2 экземпляра зоопарка и распределить животных по зоопаркам.
    //Никаких проверок if instanceof быть не должно, и внутри Zoo будут лежать Generics, а не интерфейсы.

    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Eagle eagle = new Eagle();
        Bat bat = new Bat();
        Fish fish = new Fish();
        Bobr bobr = new Bobr();

        Zoo<Eagle, Tiger, Fish> zoo1 = new Zoo<>(eagle, tiger, fish);
        Zoo<Bat, Lion, Bobr> zoo2 = new Zoo<>();
        zoo2.setBitable(lion);
        zoo2.setSwimable(bobr);
        zoo2.setFlyable(bat);

        zoo1.feedBitable();
        zoo2.feedBitable();

        //        Моя неверная реализация
//
//        AnimalFlyable bird1 = new AnimalFlyable();
//        AnimalFlyable bird2 = new AnimalFlyable();
//        AnimalSwimable fish1 = new AnimalSwimable();
//        AnimalSwimable fish2 = new AnimalSwimable();
//        AnimalBitable tiger1 = new AnimalBitable();
//        AnimalBitable tiger2 = new AnimalBitable();
//
//        Zoo<AnimalFlyable, AnimalSwimable, AnimalBitable> zoo1 = new Zoo<>(bird1, fish1, tiger1);
//        zoo1.getSwimable().swim();
//        System.out.println(zoo1.getSwimable());
//        zoo1.getBitable().bite();
//        zoo1.getFlyable().fly();
//
//        Zoo<AnimalFlyable, AnimalSwimable, AnimalBitable> zoo2 = new Zoo<>(bird2, fish2, tiger2);
//        zoo2.getSwimable().swim();
//        System.out.println(zoo2.getSwimable());
//        zoo2.getBitable().bite();
//        zoo2.getFlyable().fly();

    }
}
