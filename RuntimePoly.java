// Runtime polymorphism(Method Overriding)

class Animal{
    void sound(){
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
}

public class RuntimePoly{
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();
    }
}
// dog barks