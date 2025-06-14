public class string {
    public static void main (String[] args) {
        //string
        String name1 = "meet";
        String name2 = "pansuriya";
        //length of string using length() method
        System.out.println(name1.length());

        //concatination of string
        String name = name1 + " " + name2;
        System.out.println(name);

        //index in string using charAt() method
        System.out.println(name.charAt(5));

        //replace character using replace() method
        String name3 = name.replace('e','i');
        System.out.println(name3);

        //make a substring() range will be to + 1 
        System.out.println(name.substring(0 , 4));




    }
}
