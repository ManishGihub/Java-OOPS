// Compile time polymorphism(Method Overloading)

class Calculate{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}

public class CompiletimePoly{
    public static void main(String []args){
        Calculate c = new Calculate();

        System.out.println(c.add(1,2));
        System.out.println(c.add(1.5,3.5));
        System.out.println(c.add(1,2,3));
    }
}

// 3
// 5.0
// 6
