class practice {
    public static boolean isValid(String s) {
        System.out.println(s.length());
        String[] callStack = new String[s.length()];
        boolean result = true;
        int lastidx = -1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '{'){
                callStack[lastidx + 1] = "CURLY";
                lastidx++;
            }
            else if(c == '('){
                callStack[lastidx + 1] = "ROUND";
                lastidx++;
            }
            else if(c == '['){
                callStack[lastidx + 1] = "SQUARE";
                lastidx++;
            }
            else if(c == '}'){
                if(callStack[lastidx] ==  "CURLY"){
                    callStack[lastidx] = "";
                lastidx--;
                }
                else{
                    result = false;
                    break;
                }
            }
            else if(c == ']'){
                if(callStack[lastidx] ==  "SQUARE"){
                    callStack[lastidx] = "";
                lastidx--;
                }
                else{
                    result = false;
                    break;
                }
            }
            else if(c == ')'){
                if(callStack[lastidx] ==  "ROUND"){
                    callStack[lastidx] = "";
                lastidx--;
                }
                else{
                    result = false;
                    break;
                }
            }
        }
        for(int i = 0; i < callStack.length;i++){
            System.out.println(callStack[i]);
            System.out.println((callStack[i] == "" && callStack[i] != null) || (callStack[i] == null && callStack[i] != ""));
           
            if((callStack[i] == "" && callStack[i] == null)){
                result = false;
            }
        }
        return result;
    }
        public static void main(String[] args){
            String s = "}";
            isValid(s);
        }
}
    
    
    
