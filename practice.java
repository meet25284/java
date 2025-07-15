public class practice {

    String name;
    float salary;

    // Constructor
    public practice(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }
    public void print(){
        System.out.println(name);
        System.out.println(salary);
    }
    public static void main(String[] args) {
        practice emp = new practice("meet",100000F);
        emp.print();
    }
    
}
    
    
    
