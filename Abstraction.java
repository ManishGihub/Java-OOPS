//Abstraction

abstract class Animal{
    Animal(){
        System.out.println("Creating Animal");
    }
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created Horse");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}

public class Abstraction{
    public static void main(String []args){
        Horse h = new Horse();
        h.walk();
        h.eat();
    }
}

// Creating Animal  - This is called as constructor chaining
// Created Horse
// Walk on 4 legs
// Animal eats