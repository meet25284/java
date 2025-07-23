import StackClass.Stack;

public class practice {

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            s.push(top);
            return;
        }
        int top = s.pop();
        reverse(s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);
    }
}