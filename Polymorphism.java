// parent class
class Student{
    int age;
    //method overloading
    public void printInfo(){
        System.out.println("no info");

    }

    public void printInfo(int age){
        System.out.println(age);
    }
}
//method overriding
class Age extends Student{
    public void printInfo(int age){
        System.out.println(age);
    }
}
public class Polymorphism {
    public static void main(String args[]){

    Student info = new Student();
    Age age = new Age();
        // dynamic dispatch
    Student polymorphicObj = new Age();

    info.printInfo();
    info.printInfo(10);

    age.printInfo(20);
    polymorphicObj.printInfo(30);

}
}
