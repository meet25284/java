class student{
        String name;
        int age;

        public void info(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
        student(){
            System.out.println("hello don");
        }
        student(String name, int age){//we can pass parameter in constructor
            this.name = name;
            this.age = age;
        }
        student(student r2){//its a copy constructor
            this.name = r2.name;
            this.age = r2.age;
        }
        student(){

        }
}
public class oops {
    public static void main(String[] args) {
        student r1 = new student();
        r1.name = "meet";
        r1.age = 17;

        student r2 = new student(r1);
        r2.info();
    }
    
}
