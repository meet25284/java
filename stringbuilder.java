public class stringbuilder {
    public static void main(String[] args){
        //string builder is use to make string muttable 


        //get char using charAt method
        StringBuilder sb = new StringBuilder("meet");
        System.out.println(sb.charAt(0));

        //to change the char.. at specific location using setcharAt(index where change want,change you want)
        sb.setCharAt(0, 'h');
        System.out.println(sb);

        //to add char at perticular index can do using insert(index,character)
        sb.insert(1, 'e');
        System.out.println(sb);

        //to remove any string can do using delete(start index , end index)
        sb.delete(1, 2);
        System.out.println(sb);

        //can add at the end using append
        sb.append(" gopani");
        System.out.println(sb);
    }
    
}
