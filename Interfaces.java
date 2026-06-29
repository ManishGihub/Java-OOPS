//Interface

interface Animal{
    int eyes = 2;
    void walk();
}

interface Herbivore{
    int nose = 1;
}

class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Walking");
    }
} 

public class Interfaces{
    public static void main(String []args){
        Horse h1 = new Horse();
        h1.walk();;
    }
}

// Walking