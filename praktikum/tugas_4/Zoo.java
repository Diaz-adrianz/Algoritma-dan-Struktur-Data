package tugas_4;

class Animal {

    public void sound() {
        System.out.println("Binatang Bersuara");
    }
}

class Horse extends Animal {

    @Override
    public void sound() {
        System.out.println("Meringkik");
    }
}

class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Meong");
    }

}

public class Zoo {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Animal horse = new Horse();
        horse.sound();

        Animal cat = new Cat();
        cat.sound();

    }
}
