public class casting {
    public static void main (String[] args) {
        //casting can be done in java using (name of datatype in which you want to cast)
        int a = (int)18.2873;
        System.out.println(a);

        //make a constant which can't change using final
        float pi = 3.14F;
        pi = 3;
        System.out.println(pi);
        //if we do this it show error
        final float pi = 3.14F;
        pi = 5;
        System.out.println(pi);

    }
}
