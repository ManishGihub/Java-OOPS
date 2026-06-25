class Student{
    String name;
    int age;

    //Non Parameterized Constructor
    Student(){
        System.out.println("Constructor Called");
    }

    //Parameterized Constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Copy constructor
    Student(Student s3){
        this.name = s3.name;
        this.age = s3.age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Constructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("OM",23);
        Student s3 = new Student(s2);
        
        s2.printInfo();
        s3.printInfo();
    }
}
// Constructor Called
// OM
// 23
// OM
// 23