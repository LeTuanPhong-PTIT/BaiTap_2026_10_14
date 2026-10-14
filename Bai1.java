abstract class Animal{
    protected String name;
    abstract void makeSound();
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Gau gau");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meo meo");
    }
}

public class Bai1 {
    public static void main(String[] args){
        Animal[] animals = {
            new Dog(),
            new Cat()
        };

        for (Animal animal: animals){
            animal.makeSound();
        }
    }
}
