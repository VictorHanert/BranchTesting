public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        System.out.println("What does the fox say?");
        Fox fox = new Fox();
        fox.makeSound();
    }
}

