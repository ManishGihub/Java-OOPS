class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }

    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class ClassObj{
    public static void main(String []args){
        Pen p1 = new Pen();  //Object Creation
        p1.color = "Green";
        p1.type = "Gel";
        p1.write();

        Pen p2 = new Pen();
        p2.color = "Red";
        p2.type = "Ball";
        
        p1.printInfo();;
        p2.printInfo();;
    }
}

// Writing Something
// Green
// Gel
// Red
// Ball
