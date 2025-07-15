class Password{
    private String password = "meet";

    // setter
    public void setPassword(String pass){
        this.password = pass;
    }
    //getter
    public void getPassword(){
        this.password = password;//we can also do this
        System.out.println(this.password);  
    }
}
public class Getter_Setter {
    public static void main(String[] args) {
        Password pw = new Password();
        pw.setPassword("meet");
        pw.getPassword();
    }
    
}
