//Inheritance

class shape{       // Hybrid Inheritance
    String color;
}

class triangle extends shape{   // Single Inheritance
    public void area(int l,int h){
        System.out.println(0.5 * l * h);
    }
}

class equilateralTriangle extends triangle{  // Multi level Inheriatnce
    public void printName(){
        System.out.println("Equilateral Triangle");
    }
}

class square extends shape{  // Multiple Inheritance
    String no;
}

public class Inheritance{
    public static void main(String[] args) {
        triangle t = new triangle();
        t.color = "red";
    }
}